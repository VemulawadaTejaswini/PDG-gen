import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.io.PrintStream;
import java.util.PriorityQueue;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.AbstractCollection;
import java.util.StringTokenizer;
import java.io.BufferedReader;
import java.util.Comparator;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author Eric
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        FastReader in = new FastReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        DDoubleDots solver = new DDoubleDots();
        solver.solve(1, in, out);
        out.close();
    }

    static class DDoubleDots {
        private DDoubleDots.Node[] nodes;

        public void solve(int testNumber, FastReader in, PrintWriter out) {
            int n = in.nextInt();
            int m = in.nextInt();
            nodes = new DDoubleDots.Node[n];
            for (int i = 0; i < n; i++) {
                nodes[i] = new DDoubleDots.Node();
                nodes[i].id = i;
            }
            for (int i = 0; i < m; i++) {
                int a = in.nextInt() - 1;
                int b = in.nextInt() - 1;
                nodes[a].next.add(nodes[b]);
                nodes[b].next.add(nodes[a]);
            }
            solveMe();
            printMe(out);

            //out.print("Case #"+ testNumber + ": ");
        }

        private void solveMe() {
            DDoubleDots.Node root = nodes[0];
            PriorityQueue<DDoubleDots.Node> p = new PriorityQueue<>(Comparator.comparingInt(n2 -> n2.dist));
            root.visited = true;
            p.add(root);
            while (!p.isEmpty()) {
                DDoubleDots.Node node = p.poll();
                for (DDoubleDots.Node next : node.next) {
                    if (!next.visited) {
                        next.visited = true;
                        next.dist = node.dist + 1;
                        next.prev = node.id;
                        p.add(next);
                    }
                }
            }
        }

        private void printMe(PrintWriter out) {
            for (int i = 1; i < nodes.length; i++) {
                if (nodes[i].prev == null) {
                    out.println("No");
                    return;
                }
            }
            out.println("Yes");
            for (int i = 1; i < nodes.length; i++) {
                out.println(nodes[i].prev + 1);
            }
        }

        public static class Node {
            public boolean visited;
            ArrayList<DDoubleDots.Node> next = new ArrayList<>();
            Integer prev;
            int dist;
            int id;

        }

    }

    static class FastReader {
        public BufferedReader br;
        public StringTokenizer st;
        String context = null;

        public FastReader(InputStream in) {
            this(new InputStreamReader(in));
        }

        public FastReader(InputStreamReader input) {
            br = new BufferedReader(input);
        }

        public String next() {
            if (context != null) {
                System.err.print("[" + context + "] Wait for input ...");
            }
            while (st == null || !st.hasMoreElements()) {
                try {
                    String s = br.readLine();
                    if (s == null)
                        return null;
                    st = new StringTokenizer(s);
                } catch (IOException e) {
                    e.printStackTrace();
                    throw new RuntimeException("Could not read");
                }
            }
            String res = st.nextToken();
            if (context != null) {
                System.err.println("[" + context + "] ... received : " + res);
            }
            return res;
        }

        public int nextInt() {
            return Integer.parseInt(next());
        }

    }
}

