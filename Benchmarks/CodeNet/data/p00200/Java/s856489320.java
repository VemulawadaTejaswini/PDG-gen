import java.util.*;

public class Main{

    int n,m;
    int[][] dc, dt;
    int[][] cost, time;
    int INF = 100000000;

    void solve(){
        Scanner sc = new Scanner(System.in);

        while(true){
            n = sc.nextInt();
            m = sc.nextInt();
            if(n==0 && m==0) break;

            cost = new int[m][m];
            time = new int[m][m];
            for(int i=0; i<m; i++){
                Arrays.fill(cost[i], INF);
                Arrays.fill(time[i], INF);
            }
            for(int i=0; i<n; i++){
                int a = sc.nextInt()-1, b = sc.nextInt()-1;
                int c = sc.nextInt(), t = sc.nextInt();
                cost[a][b] = c; cost[b][a] = c;
                time[a][b] = t; time[b][a] = t;
            }

            dc = warshall_floyd(cost);
            dt = warshall_floyd(time);

            int k = sc.nextInt();
            for(int i=0; i<k; i++){
                int p = sc.nextInt()-1, q = sc.nextInt()-1;
                int r = sc.nextInt();
                if(r==0) System.out.println(dc[p][q]);
                if(r==1) System.out.println(dt[p][q]);
            }
        }
    }

    int[][] warshall_floyd(int[][] dd){

        for(int k=0; k<m; k++){
            for(int i=0; i<m; i++){
                for(int j=0; j<m; j++){
                    dd[i][j] = Math.min(dd[i][j], dd[i][k]+dd[k][j]);
                }
            }
        }
        return dd;
    }

    public static void main(String[] args){
        new Main().solve();
    }
}