import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        Scanner in = new Scanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        AizuQueue solver = new AizuQueue();
        solver.solve(1, in, out);
        out.close();
    }

    static class AizuQueue {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            final int n = in.nextInt();
            final int q = in.nextInt();

            AizuQueue.Queue queue = new AizuQueue.Queue();
            for (int i = 0; i < n; i++) {
                final String id = in.next();
                final int t = in.nextInt();

                queue.enqueue(new AizuQueue.Pair(id, t));
            }

            long curr = 0L;
            while (!queue.isEmpty()) {
                AizuQueue.Pair p = queue.dequeue();

                if (p.t > q) {
                    curr += q;
                    p.t -= q;
                    queue.enqueue(p);
                } else {
                    curr += p.t;
                    out.printf("%s %d\n", p.id, curr);
                }
            }
        }

        static class Queue {
            private AizuQueue.Node.Queue head;
            private AizuQueue.Node.Queue tail;

            public Queue() {
                head = tail = null;
            }

            public void enqueue(final AizuQueue.Pair p) {
                AizuQueue.Node.Queue n = new AizuQueue.Node.Queue(p, null, null);

                if (head == null) {
                    head = tail = n;
                } else {
                    tail.next = n;
                    n.prev = tail;
                    tail = n;
                }
            }

            public AizuQueue.Pair dequeue() {
                if (head == null) {
                    throw new IllegalStateException("empty queue");
                }

                final AizuQueue.Pair p = head.key;
                head = head.next;

                if (head == null) {
                    tail = null;
                }

                return p;
            }

            public boolean isEmpty() {
                return head == null;
            }

            static class Node {
                AizuQueue.Pair key;
                AizuQueue.Node.Queue next;
                AizuQueue.Node.Queue prev;

                public Node(final AizuQueue.Pair key, final AizuQueue.Node.Queue prev, final AizuQueue.Node.Queue next) {
                    this.key = key;
                    this.prev = prev;
                    this.next = next;
                }

            }

        }

        static class Pair {
            String id;
            int t;

            public Pair(final String id, final int t) {
                this.id = id;
                this.t = t;
            }

        }

    }
}


