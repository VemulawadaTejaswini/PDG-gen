import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.io.DataInputStream;
import java.util.Collection;
import java.io.IOException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;
import java.util.LinkedList;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author iavanish
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

        public void solve(int testNumber, FastReader in, PrintWriter out) {
            int n = in.nextInt();
            int m = in.nextInt();

            List<List<Integer>> adjList = new ArrayList<>();
            for (int i = 0; i <= n; i++) {
                adjList.add(new ArrayList<>());
            }

            for (int i = 0; i < m; i++) {
                int a = in.nextInt();
                int b = in.nextInt();
                adjList.get(a).add(b);
                adjList.get(b).add(a);
            }

            Queue<Integer> queue = new LinkedList<>();
            boolean[] isVisited = new boolean[n + 1];
            int[] parent = new int[n + 1];
            queue.offer(1);
            isVisited[1] = true;

            while (!queue.isEmpty()) {
                int node = queue.poll();
                for (Integer next : adjList.get(node)) {
                    if (!isVisited[next]) {
                        queue.offer(next);
                        isVisited[next] = true;
                        parent[next] = node;
                    }
                }
            }

            boolean flag = true;
            for (int i = 2; i <= n; i++) {
                if (!isVisited[i]) {
                    flag = false;
                }
            }

            if (!flag) {
                out.println("No");
            } else {
                out.println("Yes");
                for (int i = 2; i <= n; i++) {
                    out.println(parent[i]);
                }
            }
        }

    }

    static class FastReader {

        private final int BUFFER_SIZE = 1 << 16;
        private final InputStream inputStream;
        private final byte[] buffer;
        private int bufferPointer;
        private int bytesRead;

        public FastReader() {
            this.inputStream = new DataInputStream(System.in);
            this.buffer = new byte[BUFFER_SIZE];
            this.bufferPointer = bytesRead = 0;
        }

        public FastReader(InputStream inputStream) {
            this.inputStream = inputStream;
            this.buffer = new byte[BUFFER_SIZE];
            this.bufferPointer = bytesRead = 0;
        }

        public FastReader(String fileName) {
            try {
                this.inputStream = new DataInputStream(new FileInputStream(fileName));
                this.buffer = new byte[BUFFER_SIZE];
                this.bufferPointer = bytesRead = 0;
            } catch (FileNotFoundException e) {
                throw new RuntimeException(e);
            }
        }

        public int nextInt() {
            int nextInt = 0;
            byte c = read();
            while (c <= ' ') {
                c = read();
            }
            boolean negative = (c == '-');
            if (negative) {
                c = read();
            }
            do {
                nextInt = nextInt * 10 + c - '0';
            } while ((c = read()) >= '0' && c <= '9');
            if (negative) {
                return -nextInt;
            }
            return nextInt;
        }

        public void fillBuffer() {
            try {
                bytesRead = inputStream.read(buffer, bufferPointer = 0, BUFFER_SIZE);
                if (bytesRead == -1) {
                    buffer[0] = -1;
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

        public byte read() {
            if (bufferPointer == bytesRead) {
                fillBuffer();
            }
            return buffer[bufferPointer++];
        }

    }

}

