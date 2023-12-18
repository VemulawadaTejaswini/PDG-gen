import java.io.*;
import java.util.*;

public class Main {
    void run() {
        // 1063
        while (true) {
            int N = readInt();
            if (N == 0) break;
            int[] program = new int[N];
            HashMap<String, Integer> name2int = new HashMap<String, Integer>();
            for (int i = 0; i < N; i++) {
                String name = read();
                int weekday = readInt();
                int time = readInt();
                name2int.put(name, i);
                program[i] = hash(weekday, time);
            }
            int P = readInt();
            boolean[] fav = new boolean[N];
            for (int i = 0; i < P; i++) {
                String s = read();
                fav[name2int.get(s)] = true;
            }

            boolean conflict = false;
            boolean[] used = new boolean[7 * 24 * 60];

            for (int i = 0; i < P; i++) {
                if (fav[i]) {
                    for (int j = program[i]; j < program[i] + 30; ++j) {
                        int k = j % (7 * 24 * 60);
                        if (used[k]) conflict = true;
                        used[k] = true;
                    }
                }
            }
            if (conflict) {
                sysout.println(-1);
                continue;
            }

            int ans = P;
            for (int t = 0; t < N; t++) {
                int minT = 7 * 24 * 60;
                int minArg = -1;
                for (int i = 0; i < N; i++) {
                    boolean ok = true;
                    for (int j = 0; j < 30; ++j) {
                        int k = program[i] + j;
                        if (used[k % (7 * 24 * 60)]) ok = false;
                    }
                    if (ok) {
                        if (minT > program[i]) {
                            minT = program[i];
                            minArg = i;
                        }
                    }
                }
                if (minArg != -1) {
                    ++ans;
                    for (int i = 0; i < 30; i++) {
                        int k = program[minArg] + i;
                        used[k % (7 * 24 * 60)] = true;
                    }
                }
            }
            sysout.println(ans);
        }
    }

    int hash(int weekday, int start) {
        String s = String.valueOf(start);
        if (s.length() == 3) s = "0" + s;
        int h = Integer.parseInt(s.substring(0, 2));
        int m = Integer.parseInt(s.substring(2));
        int ret = 0;
        ret += weekday * 24 * 60;
        ret += h * 60;
        ret += m;
        return ret;
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