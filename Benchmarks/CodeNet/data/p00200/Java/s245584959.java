import java.util.*;

public class Main{

    int n,m;
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

            warshall_floyd();

            int k = sc.nextInt();
            for(int i=0; i<k; i++){
                int p = sc.nextInt()-1, q = sc.nextInt()-1;
                int r = sc.nextInt();
                if(r==0) System.out.println(cost[p][q]);
                if(r==1) System.out.println(time[p][q]);
            }
        }
    }

    void warshall_floyd(){
        for(int k=0; k<m; k++){
            for(int i=0; i<m; i++){
                for(int j=0; j<m; j++){
                    cost[i][j] = Math.min(cost[i][j], cost[i][k]+cost[k][j]);
                    time[i][j] = Math.min(time[i][j], time[i][k]+time[k][j]);
                }
            }
        }
    }

    public static void main(String[] args){
        new Main().solve();
    }
}