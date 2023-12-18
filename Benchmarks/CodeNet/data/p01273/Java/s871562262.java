import com.sun.xml.internal.bind.v2.runtime.reflect.Lister;

import java.io.*;
import java.util.*;

public class Main {

    void run() {
        while (true) {
            int N = readInt();
            int M = readInt();
            if (N == 0 && M == 0) break;
            boolean[] virus = new boolean[N];
            Arrays.fill(virus, false);
            virus[0] = true;
            ArrayList<Packet> p = new ArrayList<Packet>();
            for (int i = 0; i < M; i++) {
                int t = readInt();
                int s = readInt() - 1;
                int d = readInt() - 1;
                p.add(new Packet(t, s, d));
            }
            Collections.sort(p);
            for (int i = 0; i < M; i++) {
                if (virus[p.get(i).src]) {
                    virus[p.get(i).dst] = true;
                }
            }
            int ans = 0;
            for (int i = 0; i < N; i++) {
                if (virus[i]) ++ans;
            }
            sysout.println(ans);
        }
    }

    class Packet implements Comparable<Packet> {
        public int time, src, dst;

        public Packet(int time, int src, int dst) {
            this.time = time;
            this.src = src;
            this.dst = dst;
        }

        @Override
        public int compareTo(Packet o) {
            return time - o.time;
        }
    }

    public static void main(String[] args) {
        new Main().run();
    }

    // flush automatically iff you call `println` or `printf` or `format`.
    PrintWriter sysout = new PrintWriter(System.out, true);

    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer buffer = new StringTokenizer("");

    String read() {
        if (!buffer.hasMoreTokens()) {
            try {
                buffer = new StringTokenizer(in.readLine());
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        return buffer.nextToken();
    }

    int readInt() {
        return Integer.parseInt(read());
    }

    long readLong() {
        return Long.parseLong(read());
    }

    double readDouble() {
        return Double.parseDouble(read());
    }

    String readLine() {
        buffer = new StringTokenizer("");
        try {
            return in.readLine();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}