import java.util.*;
import static java.lang.System.*;
import static java.lang.Math.*;

public class Main {
    static HashMap<String, Integer> map;

    static int conv(String s){
        if(!map.containsKey(s)) map.put(s, map.size());
        return map.get(s);
    }

    static class Edge{
        int fr, to, cost;
        Edge(int fr, int to, int cost){ this.fr = fr; this.to = to; this.cost = cost; }

    }

    static ArrayList<ArrayList<Edge>> g;
    static int src, dst;

    static class State implements Comparable<State>{
        int id, d;
        int cost, kyo;
        State(int id, int d, int cost, int kyo){
            this.id = id; this.d = d; this.cost = cost; this.kyo = kyo;
        }
        public int hashCode(){
            return (id<<30) + d;
        }
        public boolean equals(Object o){
            State st = (State ) o;
            return this.id == st.id && this.d == st.d;
        }
        public int compareTo(State st){
            int diff = this.kyo - st.kyo;
            if(diff == 0){
                return this.cost - st.cost;
            }
            return diff;
        }

        public String toString(){
            return String.format("[id:%d d:%d cost:%d kyo:%d]", id, d, cost, kyo);
        }
    }

    static int dik(){
        State st = null;
        PriorityQueue<State> open = new PriorityQueue<State>();
        HashSet<State> closed = new HashSet<State>();

        for(int i=0;i<4;i++){
            st = new State(src, i, 1, 0);
            open.add(st);
        }
        while(!open.isEmpty()){
            st = open.poll();
            if(closed.contains(st)) continue;
            closed.add(st);

            //System.out.println(st);

            if(st.id == dst){
                return st.cost;
            }

            for(int i=0;i<4;i+=3){
                Edge e = g.get(st.id).get((st.d+i)%4);
                if(e != null){
                    State ns = new State(e.to, (st.d+i)%4, st.cost+1, st.kyo + e.cost);
                    open.add(ns);
                }
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(in);
        while(true){
            int m, n;
            map = new HashMap<String, Integer>();
            g = new ArrayList<ArrayList<Edge>>();

            m = sc.nextInt();
            n = sc.nextInt();

            if(m == 0 && n == 0) break;

            int[] xx = new int[m];
            int[] yy = new int[m];
            for(int i=0;i<m;i++){
                String s = sc.next();
                int x = sc.nextInt();
                int y = sc.nextInt();
                int id = conv(s);

                xx[id] = x;
                yy[id] = y;
            }

            for(int i=0;i<map.size();i++){
                ArrayList<Edge> t = new ArrayList<Edge>();
                for(int j=0;j<4;j++) t.add(null);
                g.add(t);
            }

            for(int i=0;i<n;i++){
                int a = conv(sc.next());
                int b = conv(sc.next());

                int dx = xx[b] - xx[a];
                int dy = yy[b] - yy[a];
                int cost = abs(dx) + abs(dy);

                int d = -1;
                if(dy > 0) d = 0;
                if(dx > 0) d = 1;
                if(dy < 0) d = 2;
                if(dx < 0) d = 3;

                Edge e1 = new Edge(a, b, cost);
                g.get(a).set(d, e1);

                d = (d+2) % 4;
                Edge e2 = new Edge(b, a, cost);
                g.get(b).set(d, e2);
            }

            src = conv(sc.next());
            dst = conv(sc.next());

            int res = dik();
            if(res == -1){
                out.println("impossible");
            }
            else{
                out.println(res);
            }
        }
    }

}