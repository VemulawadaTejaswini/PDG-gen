import java.util.*;

class Main{
    
    int n;
    int[] kura, shiro, sen;
    int[] ansVia;
    int goal;
    double min;
    
    void solve(){
        Scanner sc = new Scanner(System.in);
        
        n = sc.nextInt();
        
        kura = new int[n];
        shiro = new int[n];
        sen = new int[n];
        for(int i=0; i<n; i++){
            kura[i] = sc.nextInt();
            shiro[i] = sc.nextInt();
            sen[i] = sc.nextInt();
        }
        
        ansVia = new int[n];
        min = Double.MAX_VALUE;
        goal = -1;
        for(int i=0; i<n; i++){
            dijkstra(i);
        }

        ArrayList<Integer> list = new ArrayList<Integer>();
        
        list.add(new Integer(kura[goal]));
        while(ansVia[goal]!=-1){
            list.add(new Integer(kura[ansVia[goal]]));
            goal = ansVia[goal];
        }
        
        for(int i=list.size()-1; i>0; i--){
            System.out.print(list.get(i)+" ");
        }
        System.out.println(list.get(0));
    }
    
    class P{
        int pos, before, weight, bit;
        double time;
        P(int pos, int before, double time, int weight, int bit){
            this.pos = pos;
            this.before = before;
            this.time = time;
            this.weight = weight;
            this.bit = bit;
        }
    }
    
    void dijkstra(int st){
        //pos, before, time, weight, bit
        PriorityQueue<P> 
            q = new PriorityQueue<P>(10, new Comparator<P>(){
                    public int compare(P a, P b){
                        if(a.time<b.time) return -1;
                        else if(a.time>b.time) return 1;
                        else return 0;
                    }
                });
        q.add(new P(st, -1, 0.0, sen[st]*20, 1<<st));
        int[] via = new int[n];
        Arrays.fill(via, -1);

        boolean[][] v = new boolean[n][1<<n];
        
        while(q.size()>0){
            P qq = q.poll();
            int pos = qq.pos, before = qq.before, weight = qq.weight, bit = qq.bit;
            double time = qq.time;
            
            if(v[pos][bit]) continue;
            v[pos][bit] = true;

            via[pos] = before;
            
            if(bit==(1<<n)-1){
                if(time<min){
                    min = time;
                    goal = pos;
                    for(int i=0; i<n; i++) ansVia[i] = via[i];
                }
                return;
            }
            
            for(int i=0; i<n; i++){
                if((bit & (1<<i)) > 0 || i==pos || i==st) continue;
                double newT = (time + Math.abs(shiro[i] - shiro[pos])) / (2000.0/(double)(70+weight));
                int newW = weight + sen[i] * 20;
                q.add(new P(i, pos, newT, newW, bit^(1<<i)));
            }
        }
    }
    
    public static void main(String[] args){
        new Main().solve();
    }
}