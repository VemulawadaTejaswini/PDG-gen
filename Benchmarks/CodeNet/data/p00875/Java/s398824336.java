import java.util.*;

class Main{

    int n;
    String[] a, b;
    String start, goal;

    void solve(){
        Scanner sc = new Scanner(System.in);

        while(true){
            n = sc.nextInt();
            if(n==0) break;
            a = new String[n]; b = new String[n];
            for(int i=0; i<n; i++){
                a[i] = sc.next(); b[i] = sc.next();
            }
            start = sc.next(); goal = sc.next();
            System.out.println(bfs());
        }
    }

    class P{
        String s;
        int cnt;
        P(String s, int cnt){
            this.s = s;
            this.cnt = cnt;
        }
    }

    int bfs(){
        LinkedList<P> q = new LinkedList<P>();
        q.add(new P(start, 0));
        HashSet<String> set = new HashSet<String>();
        while(q.size()>0){
            P p = q.poll();
            String s = p.s; int cnt = p.cnt;

            if(s.equals(goal)) return cnt;
            if(s.length()>30 || !set.add(s)) continue;

            for(int i=0; i<n; i++){
                String ns = s.replaceAll(a[i], b[i]);
                if(ns.equals(s)) continue;
                q.add(new P(ns, cnt + 1));
            }
        }
        return -1;
    }

    public static void main(String[] args){
        new Main().solve();
    }
}