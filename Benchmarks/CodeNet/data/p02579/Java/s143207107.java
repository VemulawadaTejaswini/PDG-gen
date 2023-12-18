import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

class Main {
    public static void main(String[] args) {
        long timeStart = System.nanoTime();
        Utility.FastReader fr = new Utility.FastReader();
        Solver solver = new Solver(fr);
        int t = 1;
        while (t-- > 0) {
            solver.solve();
        }
        long timeEnd = System.nanoTime();
//        System.out.println("Completed in :" + ((double) (timeEnd - timeStart) / 1000000) + " miliseconds");
    }

    static class Solver {
        Utility.FastReader fr;
        static Node[][] grid;
        static int[] dx={0, 0, 1, -1};
        static int[] dy={1, -1, 0, 0};
        static int nComponents=-1;
        static boolean[][] adjMat;

        static class Node{
            int x, y;
            int color;
            boolean visited=false;
            char ch;
            public Node(int x, int y, char ch){
                this.x=x; this.y=y; this.ch=ch;
            }
        }
        public Solver(Utility.FastReader fr) {
            this.fr = fr;
        }

        static boolean isValid(int x, int y){
            int r=grid.length;
            int c=grid[0].length;
            return (x>=0 && x<r && y>=0 && y<c && grid[x][y].ch != '#');
        }

        static void dfs(Node nd){
            nd.visited=true;
            int newX, newY;
            nd.color=nComponents;
            for(int i=0; i<4; ++i){
                newX=nd.x+dx[i];
                newY=nd.y+dy[i];
                if(isValid(newX, newY) && !grid[newX][newY].visited){
                    dfs(grid[newX][newY]);
                }
            }
        }

        static int getMinDistance(int[] distances, boolean[] visited){
            int minDistance=Integer.MAX_VALUE;
            int idx=-1;
            for(int i=0; i<distances.length; ++i){
                if(!visited[i] && distances[i] < minDistance){
                    minDistance = distances[i];
                    idx = i;
                }
            }
            return idx;
        }

        static int dijkstra(int src, int dest){
            boolean[] visited=new boolean[nComponents];
            int[] distances=new int[nComponents];
            Arrays.fill(distances, Integer.MAX_VALUE);
            distances[src]=0;
            for(int i=0; i<nComponents; ++i){
                int curr=getMinDistance(distances, visited);
                if(curr==-1) return -1;
                visited[curr]=true;
                for(int j=0; j<nComponents; ++j){
                    if(!visited[j] && distances[curr]!=Integer.MAX_VALUE && adjMat[curr][j] && distances[j] > distances[curr] + 1){
                        distances[j]=distances[curr] + 1;
                    }
                }
            }
            return distances[dest] == Integer.MAX_VALUE ? -1 : distances[dest];

        }

        void solve() {
            int h=fr.nextInt(), w=fr.nextInt();
            int x1=fr.nextInt()-1, y1=fr.nextInt()-1;
            int x2=fr.nextInt()-1, y2=fr.nextInt()-1;
            grid=new Node[h][w];
            for(int i=0; i<h; ++i){
                String s=fr.nextLine();
                for(int j=0; j<w; ++j){
                    char ch=s.charAt(j);
                    grid[i][j]=new Node(i, j, ch);
                }
            }

            for(int i=0; i<h; ++i){
                for(int j=0; j<w; ++j){
                    if(grid[i][j].ch!='#' && !grid[i][j].visited){
                        nComponents++;
                        dfs(grid[i][j]);
                    }
                }
            }
            nComponents++;
            adjMat=new boolean[nComponents][nComponents];
            int newX, newY;
            for(Node[] nodes: grid){
                for(Node node: nodes){
                    if(node.ch=='#') continue;
                    for(int i=-2; i<=2; ++i){
                        for(int j=-2; j<=2; ++j){
                            newX=node.x+i;
                            newY=node.y+j;
                            if(isValid(newX, newY) && grid[newX][newY].color != node.color){
                                adjMat[node.color][grid[newX][newY].color]=true;
                                adjMat[grid[newX][newY].color][node.color]=true;
                            }
                        }
                    }
                }
            }

            int srcColor=grid[x1][y1].color;
            int destColor=grid[x2][y2].color;
            int res=dijkstra(srcColor, destColor);
            System.out.println(res);
        }
    }

    static class Utility {
        static void sort(int[] a) {
            ArrayList<Integer> list = new ArrayList<>();
            for (int i : a) list.add(i);
            Collections.sort(list);
            for (int i = 0; i < a.length; i++) a[i] = list.get(i);
        }

        static void shuffleArray(long[] arr) {
            int n = arr.length;
            Random rnd = new Random();
            for (int i = 0; i < n; ++i) {
                long tmp = arr[i];
                int randomPos = i + rnd.nextInt(n - i);
                arr[i] = arr[randomPos];
                arr[randomPos] = tmp;
            }
        }

        static void shuffleArray(int[] arr) {
            int n = arr.length;
            Random rnd = new Random();
            for (int i = 0; i < n; ++i) {
                int tmp = arr[i];
                int randomPos = i + rnd.nextInt(n - i);
                arr[i] = arr[randomPos];
                arr[randomPos] = tmp;
            }
        }

        static int gcd(int a, int b) {
            if (b == 0)
                return a;
            return gcd(b, a % b);
        }

        static long gcd(long a, long b) {
            if (b == 0)
                return a;
            return gcd(b, a % b);
        }

        static class FastReader {
            BufferedReader br;
            StringTokenizer st;

            public FastReader() {
                br = new BufferedReader(new
                        InputStreamReader(System.in));
            }

            String next() {
                while (st == null || !st.hasMoreElements()) {
                    try {
                        st = new StringTokenizer(br.readLine());
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
                return st.nextToken();
            }

            int nextInt() {
                return Integer.parseInt(next());
            }

            long nextLong() {
                return Long.parseLong(next());
            }

            double nextDouble() {
                return Double.parseDouble(next());
            }

            String nextLine() {
                String str = "";
                try {
                    str = br.readLine();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                return str;
            }
        }
    }
}

