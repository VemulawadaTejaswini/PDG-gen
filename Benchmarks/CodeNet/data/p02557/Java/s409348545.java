import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class Main {
    static class Reader
    {
        final private int BUFFER_SIZE = 1 << 16;
        private DataInputStream din;
        private byte[] buffer;
        private int bufferPointer, bytesRead;

        public Reader()
        {
            din = new DataInputStream(System.in);
            buffer = new byte[BUFFER_SIZE];
            bufferPointer = bytesRead = 0;
        }

        public Reader(String file_name) throws IOException
        {
            din = new DataInputStream(new FileInputStream(file_name));
            buffer = new byte[BUFFER_SIZE];
            bufferPointer = bytesRead = 0;
        }

        public String readLine() throws IOException
        {
            byte[] buf = new byte[1_000_010]; // line length
            int cnt = 0, c;
            while ((c = read()) != -1)
            {
                if (c == '\n')
                    break;
                buf[cnt++] = (byte) c;
            }
            return new String(buf, 0, cnt);
        }

        public int nextInt() throws IOException
        {
            int ret = 0;
            byte c = read();
            while (c <= ' ')
                c = read();
            boolean neg = (c == '-');
            if (neg)
                c = read();
            do
            {
                ret = ret * 10 + c - '0';
            }  while ((c = read()) >= '0' && c <= '9');

            if (neg)
                return -ret;
            return ret;
        }

        public long nextLong() throws IOException
        {
            long ret = 0;
            byte c = read();
            while (c <= ' ')
                c = read();
            boolean neg = (c == '-');
            if (neg)
                c = read();
            do {
                ret = ret * 10 + c - '0';
            }
            while ((c = read()) >= '0' && c <= '9');
            if (neg)
                return -ret;
            return ret;
        }

        public double nextDouble() throws IOException
        {
            double ret = 0, div = 1;
            byte c = read();
            while (c <= ' ')
                c = read();
            boolean neg = (c == '-');
            if (neg)
                c = read();

            do {
                ret = ret * 10 + c - '0';
            }
            while ((c = read()) >= '0' && c <= '9');

            if (c == '.')
            {
                while ((c = read()) >= '0' && c <= '9')
                {
                    ret += (c - '0') / (div *= 10);
                }
            }

            if (neg)
                return -ret;
            return ret;
        }

        private void fillBuffer() throws IOException
        {
            bytesRead = din.read(buffer, bufferPointer = 0, BUFFER_SIZE);
            if (bytesRead == -1)
                buffer[0] = -1;
        }

        private byte read() throws IOException
        {
            if (bufferPointer == bytesRead)
                fillBuffer();
            return buffer[bufferPointer++];
        }

        public void close() throws IOException
        {
            if (din == null)
                return;
            din.close();
        }
    }
    class Pair implements Comparable<Pair> {
        int pos;
        int count;

        Pair(int pos, int count) {
            this.pos = pos;
            this.count = count;
        }

        @Override
        public int compareTo(Pair o) {
            return Comparator.<Pair>comparingInt(x -> x.count).reversed().thenComparingInt(x -> x.pos).compare(this, o);
        }

        @Override
        public String toString() {
            return "Pair{" +
                    "pos=" + pos +
                    ", count=" + count +
                    '}';
        }
    }
    void solve(Reader sc, PrintWriter pw) throws IOException {
        int N = sc.nextInt();
        int[] result = new int[N];
        int[] first = new int[N];
        int[] second = new int[N];
        for (int i = 0; i < N; i++) {
            first[i] = sc.nextInt();
        }

        for (int i = 0; i < N; i++) {
            second[i] = sc.nextInt();
        }

        PriorityQueue<Pair> firstPq = construct(first);
        PriorityQueue<Pair> secondPq = construct(second);

        boolean finished = false;
        while (!firstPq.isEmpty()) {
            Pair top = firstPq.poll();
            Pair secondTop = secondPq.poll();
//            System.out.println(top + " " + secondTop);
            if (second[secondTop.pos] == first[top.pos]) {
                if (secondPq.isEmpty()) {
                    if (secondTop.count > 1) {
                        pw.println("No");
                        return;
                    } else {
                        for (int i = 0; i < N; i++) {
                            if (result[i] != 0) {
                                if (first[i] != first[top.pos] && result[i] != first[top.pos]) {
                                    result[top.pos] = result[i];
                                    result[i] = first[top.pos];
                                    finished = true;
                                    break;
                                }
                            }
                        }
                        break;
                    }
                }
                Pair another = secondPq.poll();
                secondPq.add(secondTop);
                secondTop = another;
            }

            int index = top.pos + top.count - 1;
            result[index] = second[secondTop.pos];

            if (top.count > 1) {
                firstPq.add(new Pair(top.pos, top.count-1));
            }

            if (secondTop.count > 1) {
                secondPq.add(new Pair(secondTop.pos, secondTop.count-1));
            }
        }
            pw.println("Yes");
            for (int i = 0; i < N; i++) {
                if (i > 0) {
                    pw.print(" ");
                }
                pw.print(result[i]);
            }
            pw.println();
    }

    private PriorityQueue<Pair> construct(int[] data) {
        PriorityQueue<Pair> result = new PriorityQueue<>();
        int currentIndex = 0;
        while (currentIndex < data.length) {
            int nextIndex = currentIndex + 1;
            while (nextIndex < data.length && data[nextIndex] == data[currentIndex]) {
                nextIndex++;
            }

            result.add(new Pair(currentIndex, nextIndex - currentIndex));
            currentIndex = nextIndex;
        }
        return result;
    }

    public static void main(String[] args) throws IOException {
        Reader sc = new Reader();
        PrintWriter pw = new PrintWriter(System.out);
//        PrintWriter pw = new PrintWriter(System.out, true);
        new Main().solve(sc, pw);
        pw.flush();
        pw.close();
        sc.close();
    }
}


