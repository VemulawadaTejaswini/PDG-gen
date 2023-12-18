import java.util.*;
import static java.lang.System.*;
public class Main {
    static int n, m;
    static int s, g;
    static P[][] t;

    static class P{
        int d;
        int c;
        P(int d, int c){
            this.d = d; this.c = c;
        }
    }

    static class State implements Comparable<State>{
        int id;
        int from;
        int v;
        double cost;

        State(int id, int from, int v, double cost){
            this.id = id;
            this.from = from;
            this.v = v;
            this.cost = cost;
        }

        public boolean equals(Object o){
            State st = (State) o;
            return id == st.id && from == st.from && v == st.v;
        }

        public int hashCode(){
            return (this.id << 20) | (this.v << 10) | this.from;
        }

         public int compareTo(State st){
            if(this.cost - st.cost < 0) return -1;
            if(this.cost - st.cost > 0) return 1;
            return 0;
        }

        public String toString(){
            return "[" + this.id + "," + this.from + "," + this.v + "," + this.cost + "]";
        }
    }

    static void solve(){
        PriorityQueue<State> open = new PriorityQueue<State>();
        HashSet<State> closed = new HashSet<State>();
        State st = new State(s, -1, 0, 0);

        open.add(st);
        while(!open.isEmpty()){
            st = open.poll();
            if(closed.contains(st)) continue;
            closed.add(st);

//            out.println(st);

            if(st.id == g && st.v == 1){
                out.println(st.cost);
                return;
            }

            for(int i=1;i<=n;i++){
                if(st.from == i) continue;
                P p = t[st.id][i];
                if(p == null) continue;
                for(int j=-1;j<=1;j++){
                    int v = st.v + j;
                    if(v <= 0) continue;
                    if(v > p.c) continue;

                    int id = i;
                    int from = st.id;
                    double cost = st.cost + 1.0 * p.d / v;
                    State ns = new State(id, from, v, cost);
                    open.add(ns);
                }
            }
        }

        out.println("unreachable");
    }

    static void disp(){
        for(int i=1;i<=n;i++){
            for(int j=i+1;j<=n;j++){
                if(t[i][j] != null){
                    out.print(i+"-"+j+":["+t[i][j].d+","+t[i][j].c+"] ");
                    out.println(j+"-"+i+":["+t[j][i].d+","+t[j][i].c+"] ");
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(in);
        while(true){
            n = sc.nextInt();
            m = sc.nextInt();

            if(n == 0 && m == 0) break;

            t = new P[n+1][n+1];

            s = sc.nextInt();
            g = sc.nextInt();

            for(int i=0;i<m;i++){
                int x = sc.nextInt();
                int y = sc.nextInt();
                int d = sc.nextInt();
                int c = sc.nextInt();

                P p = new P(d, c);
                t[x][y] = t[y][x] = p;
            }

//            disp();

            solve();
        }
    }

}