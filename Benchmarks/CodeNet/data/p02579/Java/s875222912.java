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
//        static char grid[][];
//        static boolean visited[][];
        static int[] dx={1, -1, 0, 0};
        static int[] dy={0, 0, 1, -1};
        static Pair[][] mat;
//        static int nComponents=0;

        public Solver(Utility.FastReader fr) {
            this.fr = fr;
        }
//
//        void dfs(int start, int end, int rows, int cols){
//            visited[start][end]=true;
//            grid[start][end]=(char)('0'+nComponents);
//            for(int i=0; i<4; ++i){
//                int newX, newY;
//                newX=start+dx[i];
//                newY=end+dy[i];
//                if(newX>=0 && newX<rows && newY>=0 && newY<cols && !visited[newX][newY] && grid[newX][newY]=='.'){
//                    dfs(newX, newY, rows, cols);
//                }
//            }
//        }

        static class Pair{
            int x, y;
            int cnt=Integer.MAX_VALUE;
            char ch;
            boolean visited=false;
            public Pair(int x, int y){
                this.x=x;
                this.y=y;
            }
        }

        void solve() {
            int h=fr.nextInt(); int w=fr.nextInt();
            int sx, sy;
            sx=fr.nextInt()-1; sy=fr.nextInt()-1;
            int cx, cy;
            cx=fr.nextInt()-1; cy=fr.nextInt()-1;
//            grid=new char[h][w];
            mat=new Pair[h][w];
            for(int i=0; i<h; ++i){
                String s=fr.nextLine();
                for(int j=0; j<w; ++j){
                    mat[i][j]=new Pair(i, j);
                    mat[i][j].ch=s.charAt(j);
                }
            }

//            for(int i=0; i<h; ++i){
//                for(int j=0; j<w; ++j){
//                    if(!visited[i][j] && grid[i][j]=='.'){
//                        nComponents++;
//                        dfs(i, j, h, w);
//                    }
//                }
//            }

            Deque<Pair> q=new LinkedList<>();

            q.add(mat[cx][cy]);
//
//            for(int i=0; i<h; ++i){
//                for(int j=0; j<w; ++j){
//                    visited[i][j]=false;
//                }
//            }

            mat[cx][cy].cnt=0;
            int newX, newY;
            while(q.size() != 0 ){
                Pair p=q.poll();

                for(int i=-2; i<=2; ++i){
                    for(int j=-2; j<=2; ++j){
                        newX=p.x+i;
                        newY=p.y+j;
                        if(newX==p.x && newY==p.y) continue;
                        if(newX<0||newX>=h||newY<0||newY>=w||mat[newX][newY].ch=='#') continue;
                        int wd = 1;
                        if((Math.abs(newX-p.x) == 1 && Math.abs(newY-p.y) == 0) ||
                                (Math.abs(newY-p.y) == 1 && Math.abs(newX-p.x) == 0)){
                            wd = 0;
                        }
                        if(mat[newX][newY].cnt > p.cnt + wd){
                            mat[newX][newY].cnt = p.cnt + wd;
                            if(wd == 0)
                                q.addFirst(mat[newX][newY]);
                            else
                                q.addLast(mat[newX][newY]);
                        }
                    }
                }
                p.visited=true;
            }

            System.out.println(mat[sx][sy].cnt == Integer.MAX_VALUE ? -1 : mat[sx][sy].cnt);

//            for(char[] g: grid){
//                System.out.println(Arrays.toString(g));
//            }

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

