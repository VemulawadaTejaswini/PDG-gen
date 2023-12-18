import java.util.*;

@SuppressWarnings("unchecked")
    class Main{
        
        int n, m;
        int INF = Integer.MAX_VALUE/2;
        ArrayList[] list;
        long mod = 10000000;        

        void solve(){
            Scanner sc = new Scanner(System.in);
            while(true){
                n = sc.nextInt(); m = sc.nextInt();
                if(n==0 && m==0) break;
 
                list = new ArrayList[n+1];
                for(int i=0; i<=n; i++) list[i] = new ArrayList<Long>();
                for(int i=0; i<m; i++){
                    char command = sc.next().charAt(0);
                    if(command=='!'){
                        long a = sc.nextLong(), b = sc.nextLong(), w = sc.nextLong();
                        list[(int)a].add(b * mod + w);
                        list[(int)b].add(-(a * mod + w));
                    }else{
                        int b = dijkstra(sc.nextInt(), sc.nextInt());
                        if(b==INF) System.out.println("UNKNOWN");
                        else System.out.println(b);
                    }
                }
            }
        }
        
        int dijkstra(int start, int goal){
            //pos, cost
            LinkedList<int[]> q = new LinkedList<int[]>();
            q.add(new int[]{start, 0});
            boolean[] v = new boolean[n+1];
 
            while(q.size()>0){
                int[] qq = q.poll();
                int pos = qq[0], cost = qq[1];
 
                if(pos==goal) return cost;
                if(v[pos]) continue;
                v[pos] = true;

                for(int i=0; i<list[pos].size(); i++){
                    long X = (long)list[pos].get(i);
                    int to = 0, weight = 0;
                    if(X<0){
                        X = -X;
                        to = (int)(X / mod); weight = (int)-(X % mod);
                    }else{
                        to = (int)(X / mod); weight = (int)(X % mod);
                    }
                    q.add(new int[]{to, cost+weight});
                }
            }
            return INF;
        }
 
        public static void main(String[] args){
            new Main().solve();
        }
    }