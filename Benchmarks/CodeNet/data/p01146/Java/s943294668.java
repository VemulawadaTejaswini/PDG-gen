import java.util.*;

public class Main{

    int n,m,l,k,a,h;
    int[][] times;
    boolean[] cancold;
    int min;
    int INF = Integer.MAX_VALUE;

    void solve(){
        Scanner sc = new Scanner(System.in);

        while(true){
            n = sc.nextInt(); m = sc.nextInt();
            l = sc.nextInt(); k = sc.nextInt();
            a = sc.nextInt(); h = sc.nextInt();
            if(n+m+l+k+a+h==0) break;

            cancold = new boolean[101];
            for(int i=0; i<l; i++) cancold[sc.nextInt()] = true;

            times = new int[n][n];
            for(int i=0; i<n; i++) Arrays.fill(times[i],-1);
            for(int i=0; i<k; i++){
                int x = sc.nextInt(), y = sc.nextInt();
                int t = sc.nextInt();
                times[x][y] = t;
                times[y][x] = t;
            }

            min = INF;
            dijkstra();

            if(min==INF) System.out.println("Help!");
            else System.out.println(min);
        }
    }

    void dijkstra(){
        // pos, limit, time, sumtime
        PriorityQueue<int[]> q 
            = new PriorityQueue<int[]>(n, new Comparator<int[]>(){
                    public int compare(int[] a, int[] b){
                        return a[2] - b[2];
                    }
                });
        q.add(new int[]{a,m,0,0});
        boolean[][] v = new boolean[n][101];

        while(q.size()>0){
            int[] qq = q.poll();
            int pos = qq[0], limit = qq[1], time = qq[2];

            if(pos==h){
                if(qq[3]<m) min = Math.min(min, time-limit+(m-qq[3]));
                else min = Math.min(min, time-limit);
                continue;
            }

            if(v[pos][limit]) continue;
            v[pos][limit] = true;

            for(int i=0; i<n; i++){
                if(times[pos][i]==-1 
                   || times[pos][i]>limit) continue;
                if(cancold[i]){
                    q.add(new int[]
                        {i, m, time+times[pos][i]*2+(m-limit), 
                         qq[3]+times[pos][i]});
                }else{
                    q.add(new int[]
                        {i, limit-times[pos][i], time+times[pos][i],
                         qq[3]+times[pos][i]});
                }
            }
        }
    }


    public static void main(String[] args){
        new Main().solve();
    }
}