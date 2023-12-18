import java.util.*;

class Main{

    int n;
    int[][] dist;
    int INF = Integer.MAX_VALUE/10;

    void solve(){
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        while(n!=0){
            String[] list = new String[n];
            for(int i=0; i<n; i++) list[i] = sc.next();

            dist = new int[n][n];
            for(int i=0; i<n; i++) Arrays.fill(dist[i], INF);
            for(int i=0; i<n; i++){
                char last = list[i].charAt(list[i].length()-1);
                for(int j=0; j<n; j++){
                    char first = list[j].charAt(0);
                    if(last==first) dist[i][j] = 1;
                }
            }
            
            boolean boo = false;
            for(int start=0; start<n; start++){
                if(bfs(start)) boo = true;
            }
            if(boo) System.out.println("OK");
            else System.out.println("NG");
            n = sc.nextInt();
        }
    }

    boolean bfs(int start){
        LinkedList<int[]> q = new LinkedList<int[]>();
        boolean[][] boo = new boolean[n][n];
        q.add(new int[]{start, 0});

        while(q.size()>0){
            int[] po = q.poll();
            int pos = po[0], cnt = po[1];

            if(pos==start && cnt==n) return true;
            if(cnt>=n) continue;
            if(boo[pos][cnt]) continue;
            boo[pos][cnt] = true;

            for(int i=0; i<n; i++){
                if(dist[pos][i]!=INF) q.add(new int[]{i, cnt+1});
            }
        }
        return false;
    }

    public static void main(String[] args){
        new Main().solve();
    }
}