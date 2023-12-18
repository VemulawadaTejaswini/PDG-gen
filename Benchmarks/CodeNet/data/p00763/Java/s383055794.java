import java.util.*;

class Main{

    int n,m,c,s,g;
    int[][][] dist;
    //int[][] company;
    int[] p;
    int[][] q,r;
    int INF = Integer.MAX_VALUE/2;

    void solve(){
        Scanner sc = new Scanner(System.in);

        while(true){
            n = sc.nextInt(); m = sc.nextInt(); c = sc.nextInt();
            s = sc.nextInt(); g = sc.nextInt();
            if(n==0 && m==0 && c==0 && s==0 && g==0) break;
            s--; g--;

            //from, to, company = dist
            dist = new int[n][n][c];
            for(int i=0; i<n; i++) 
                for(int j=0; j<n; j++) Arrays.fill(dist[i][j], INF);
            for(int i=0; i<m; i++){
                int x = sc.nextInt()-1, y = sc.nextInt()-1;
                int d = sc.nextInt(), c = sc.nextInt()-1;
                dist[x][y][c] = Math.min(dist[x][y][c], d); 
                dist[y][x][c] = Math.min(dist[x][y][c], d);
            }
            p = new int[c];
            for(int i=0; i<c; i++) p[i] = sc.nextInt();
            q = new int[c][];
            r = new int[c][];
            for(int i=0; i<c; i++){
                q[i] = new int[p[i]-1];
                r[i] = new int[p[i]];
                for(int j=0; j<p[i]-1; j++) q[i][j] = sc.nextInt();
                for(int j=0; j<p[i]; j++) r[i][j] = sc.nextInt();
            }

            for(int l=0; l<c; l++)
                for(int k=0; k<n; k++)
                    for(int i=0; i<n; i++)
                        for(int j=0; j<n; j++)
                            dist[i][j][l] = Math.min(dist[i][j][l], dist[i][k][l] + dist[k][j][l]);

            int[][] cost = new int[n][n];
            for(int i=0; i<n; i++) Arrays.fill(cost[i], INF);
            for(int i=0; i<n; i++)
                for(int j=0; j<n; j++)
                    for(int k=0; k<c; k++)
                        if(dist[i][j][k]!=INF)
                            cost[i][j] = Math.min(cost[i][j], getCost(k, dist[i][j][k]));
                                              
            for(int k=0; k<n; k++)
                for(int i=0; i<n; i++)
                    for(int j=0; j<n; j++) cost[i][j] = Math.min(cost[i][j], cost[i][k] + cost[k][j]);
                

            if(cost[s][g]==INF) cost[s][g] = -1;
            System.out.println(cost[s][g]);
        }
    }

    int getCost(int com, int di){
        int res = 0;
        for(int i=0; i<p[com]-1; i++){
            if(di>=q[com][i]){
                int minus = q[com][i];
                if(i!=0) minus -= q[com][i-1];
                res += r[com][i] * minus;
                di -= minus;
            }else{
                res += r[com][i] * di;
                di = 0;
            }
        }
        res += di * r[com][p[com]-1];
        return res;
    }

    public static void main(String[] args){
        new Main().solve();
    }
}