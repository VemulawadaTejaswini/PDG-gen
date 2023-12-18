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
            LinkedList<Long> q = new LinkedList<Long>();
            q.add((long)start*mod);
            boolean[] v = new boolean[n+1];
 
            while(q.size()>0){
                long qq = q.poll();
                long pos = 0, cost = 0;
                if(qq<0){
                    qq = -qq;
                    pos = qq/mod; cost = -(qq%mod);
                }else{
                    pos = qq/mod; cost = qq%mod;
                }
 
                if(pos==goal) return (int)cost;
                if(v[(int)pos]) continue;
                v[(int)pos] = true;

                for(int i=0; i<list[(int)pos].size(); i++){
                    long X = (long)(Long)list[(int)pos].get(i);
                    long to = 0, weight = 0;
                    if(X<0){
                        X = -X;
                        to = X / mod; weight = -(X % mod);
                    }else{
                        to = X / mod; weight = X % mod;
                    }
                    long neww = cost + weight;
                    if(neww<0){
                        long newl = to * mod + (-neww);
                        q.add(-newl);
                    }else{
                        long newl = to * mod + neww;
                        q.add(newl);
                    }
                }
            }
            return INF;
        }
 
        public static void main(String[] args){
            new Main().solve();
        }
    }