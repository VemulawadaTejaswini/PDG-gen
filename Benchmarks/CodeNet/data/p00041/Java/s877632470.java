import java.io.*;
import java.util.*;

public class Main {
    int[] values;
    boolean end;

    void run() {
        while(true) {
            int a = readInt(), b = readInt(), c = readInt(), d = readInt();
            if (a == 0 && b == 0 && c == 0 && d == 0) break;
            values = new int[]{a, b, c, d};
            used = new boolean[4];
            perm = new int[4];
            end = false;
            permutation(0, 4);
            if(!end) sysout.println(0);
        }
    }

    boolean[] used;
    int[] perm;

    void permutation(int pos, int n) {
        if (pos == n) {
            calculate();
            return;
        }
        for(int i = 0; i < n; ++i) {
            if (used[i]) continue;
            used[i] = true;
            perm[pos] = i;
            permutation(pos + 1, n);
            used[i] = false;
        }
    }

    void calculate() {
        if (end) return;
        int[] nums = new int[4];
        for (int i = 0; i < 4; i++) {
            nums[i] = values[perm[i]];
        }
        char[] ops = new char[]{'+', '-', '*'};
        for(int a = 0; a < 3; ++a) {
            for(int b = 0; b < 3; ++b) {
                for(int c = 0; c < 3; ++c) {
                    char o1 = ops[a], o2 = ops[b], o3 = ops[c];
                    if (apply(apply(apply(nums[0], o1, nums[1]), o2, nums[2]), o3, nums[3]) == 10) {
                        sysout.printf("(((%d %c %d) %c %d) %c %d)\n", nums[0], o1, nums[1], o2, nums[2], o3, nums[3]);
                        end = true;
                        return;
                    }

                    if (apply(apply(nums[0], o1, nums[1]), o2, apply(nums[2], o3, nums[3])) == 10) {
                        sysout.printf("((%d %c %d) %c (%d %c %d))\n", nums[0], o1, nums[1], o2, nums[2], o3, nums[3]);
                        end = true;
                        return;
                    }

                    if (apply(apply(nums[0], o1, apply(nums[1], o2, nums[2])), o3, nums[3]) == 10) {
                        sysout.printf("((%d %c (%d %c %d)) %c %d)\n", nums[0], o1, nums[1], o2, nums[2], o3, nums[3]);
                        end = true;
                        return;
                    }

                    if (apply(nums[0], o1, apply(apply(nums[1], o2, nums[2]), o3, nums[3])) == 10) {
                        sysout.printf("(%d %c ((%d %c %d) %c %d))\n", nums[0], o1, nums[1], o2, nums[2], o3, nums[3]);
                        end = true;
                        return;
                    }

                    if (apply(nums[0], o1, apply(nums[1], o2, apply(nums[2], o3, nums[3]))) == 10) {
                        sysout.printf("(%d %c (%d %c (%d %c %d)))\n", nums[0], o1, nums[1], o2, nums[2], o3, nums[3]);
                        end = true;
                        return;
                    }
                }
            }
        }
    }

    int apply(int l, char op, int r) {
        if (op == '+') return l + r;
        if (op == '-') return l - r;
        if (op == '*') return l * r;
        throw new RuntimeException();
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