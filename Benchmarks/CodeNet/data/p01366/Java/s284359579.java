import java.util.*;

class Main{

    int n, m;
    ArrayList<int[]>[] edge;
    int[] dist;
    int INF = Integer.MAX_VALUE;
             
    @SuppressWarnings("unchecked")
    void solve(){
        Scanner sc = new Scanner(System.in);

        while(true){
            int n = sc.nextInt();
            int m = sc.nextInt();
            if(n==0 && m==0) break;

            edge = new ArrayList[n];
            for(int i=0; i<n; i++) edge[i] = new ArrayList<int[]>();
            dist = new int[n];
            Arrays.fill(dist, INF);

            for(int i=0; i<m; i++){
                int u = sc.nextInt()-1, v = sc.nextInt()-1;
                int d = sc.nextInt(), c = sc.nextInt();
                edge[u].add(new int[]{v, d, c});
                edge[v].add(new int[]{u, d, c});
            }

            dijstra();

            int[] cost = new int[n];
            Arrays.fill(cost, INF);

            for(int i=0; i<n; i++){
                for(int j=0; j<edge[i].size(); j++){
                    int to = edge[i].get(j)[0];
                    int d = edge[i].get(j)[1];
                    int c = edge[i].get(j)[2];
                    if(dist[i]==dist[to] + d) cost[i] = Math.min(cost[i], c);
                }
            }

            int ans = 0;
            for(int i=1; i<n; i++){
                ans += cost[i];
            }

            System.out.println(ans);
        }
    }

    void dijstra(){
        //pos, cost(dist)
        PriorityQueue<int[]> q = new PriorityQueue<int[]>(10, new Comparator<int[]>(){
                public int compare(int[] a, int[] b){
                    return a[1] - b[1];
                }
            });

        q.add(new int[]{0, 0});

        while(q.size()>0){
            int[] qq = q.poll();
            int pos = qq[0], cost = qq[1];

            if(dist[pos]<=cost) continue;
            dist[pos] = cost;

            for(int i=0; i<edge[pos].size(); i++){
                int to = edge[pos].get(i)[0];
                int d = edge[pos].get(i)[1];

                q.add(new int[]{to, cost+d});
            }
        }
    }

    public static void main(String[] args){
        new Main().solve();}
}