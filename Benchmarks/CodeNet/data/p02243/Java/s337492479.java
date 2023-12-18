import java.io.*;
import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Scanner;

class Pair {
    int f, s;
    Pair(int f, int s) {
        this.f = f; this.s = s;
    }

    public boolean equals(Object o) {
        if(!(o instanceof Pair)) return false;
        Pair p = (Pair)o;
        return p.f==this.f && p.s==this.s;
    }
}
class PairComparator implements Comparator<Pair> {
    public int compare(Pair l, Pair r) {
        if (l.f != r.f) return l.f - r.f;
        else if(l.s != r.s)  return l.s - r.s;
        else return 0;
    }
}

public class Main {

    private static int[][] cost;
    private static int start_pos;
    private static int node_n;
    private static int[] d, prev;
    private static void dijkstra() {
        d = new int[node_n]; Arrays.fill(d, Integer.MAX_VALUE); d[start_pos] = 0;
        prev = new int[node_n];

        PriorityQueue<Pair> Q = new PriorityQueue<>(new PairComparator());
        for(int i=0; i<node_n; i++) Q.add(new Pair(d[i], i));

        while(!Q.isEmpty()) {
            Pair u = Q.poll();
            for(int v=0; v<node_n; v++) {
                if(cost[u.s][v] == Integer.MAX_VALUE) continue;
                int alt = d[u.s] + cost[u.s][v];
                if(d[v] > alt) {
                    d[v] = alt;
                    prev[v] = u.s;
                    Q.add(new Pair(d[v],v));
                }
            }
        }
    }

    public static void main(String[] args) throws IOException {

//        Scanner sc = new Scanner(System.in);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        node_n = n; start_pos = 0;

        cost = new int[n][n];
        for(int[] c:cost) Arrays.fill(c, Integer.MAX_VALUE);
        for(int i=0; i<n; i++) {
            String[] in = br.readLine().split(" ", 0);
            int u = Integer.parseInt(in[0]), k = Integer.parseInt(in[1]);
            for(int j=0; j<k; j++) {
                int v = Integer.parseInt(in[2+2*j]), c = Integer.parseInt(in[2+2*j+1]);
                cost[u][v] = c;
            }
        }

        dijkstra();

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<n; i++) {
            sb.append(i).append(" ").append(d[i]).append("\n");
        }
        bw.write(sb.toString());
        bw.flush();
    }
}
