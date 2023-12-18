import java.util.*;

class Main{

    String[] a, b;
    String start, goal;

    void solve(){
        Scanner sc = new Scanner(System.in);
        
        while(true){
            int n = sc.nextInt();
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
            P qq = q.poll();
            String before = qq.s; int cnt = qq.cnt;

            if(before.equals(goal)) return cnt;
            if(before.length()>=30 || !set.add(before)) continue;

            for(int i=0; i<a.length; i++){
                String ns = before.replaceAll(a[i], b[i]);
                if(before.equals(ns)) continue;
                q.add(new P(ns, cnt+1));
            }
        }
        return -1;
    }

    public static void main(String[] args){
        new Main().solve();
    }
}