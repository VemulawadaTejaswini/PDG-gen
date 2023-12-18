import java.util.*;

public class Main{

    int n,m,k;
    int[][] c;
    int[] shop;
    int[] d;

    void solve(){
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        m = sc.nextInt();
        k = sc.nextInt();
        c = new int[n][n];
        for(int i=0; i<n; i++) Arrays.fill(c[i],-1);
        for(int i=0; i<m; i++){
            int a = sc.nextInt()-1;
            int b = sc.nextInt()-1;
            int l = sc.nextInt();
            c[a][b] = l;
            c[b][a] = l;
        }

        shop = new int[k];
        for(int i=0; i<k; i++) shop[i] = sc.nextInt()-1;

        d = new int[n];
        Arrays.fill(d,-1);
        dijkstra();

        int max = 0;
        for(int i=0; i<n; i++){
            if(d[i]==-1) continue;
            for(int j=i+1; j<n; j++){
                if(c[i][j]==-1 || d[j]==-1) continue;
                int d1 = d[i], d2 = d[j];
                int cc = c[i][j];

                if(d1<d2){
                    cc -= (d2-d1);
                    d1 = d2;
                }else{
                    cc -= (d1-d2);
                    d2 = d1;
                }

                if(cc>0){
                    if(cc%2==0) d1 += cc/2;
                    else d1 += cc/2+1;
                }
                max = Math.max(max,d1);
            }
        }

        System.out.println(max);
    }

    void dijkstra(){
        //pos, cost
        PriorityQueue<int[]> 
            q = new PriorityQueue<int[]>(n, new Comparator<int[]>(){
                    public int compare(int[] a, int [] b){
                        return a[1] - b[1];
                    }
                });
        for(int i=0; i<k ;i++) q.add(new int[]{shop[i],0});

        while(q.size()>0){
            int[] qq = q.poll();
            int pos = qq[0], cost = qq[1];

            if(d[pos]!=-1) continue;
            d[pos] = cost;

            for(int i=0; i<n; i++){
                if(c[pos][i]==-1) continue;
                q.add(new int[]{i,cost+c[pos][i]});
            }
        }
    }

    public static void main(String[] args){
        new Main().solve();
    }
}