
import java.io.*;
import java.util.*;

import static java.lang.Math.*;
import static java.util.Arrays.fill;

public class Main {

    static void run() throws IOException {
        file("", "");
        long time = System.currentTimeMillis();
//        int t = nextInt();
//        while (t-- > 0)
        solution();
        end(time);
    }

    static void solution() throws IOException {
        int n = nextInt();
        int k = nextInt();
        TreeSet<Integer> tr = new TreeSet<>();
        for (int i = 0; i < k; i++) {
            int l = nextInt();
            for (int j = 0; j < l; j++) {
                tr.add(nextInt());
            }
        }
        out.println(n-tr.size());
    }

    static mem create_mem(int to, int val) {
        mem y = new mem();
        y.to = to;
        y.val = val;
        return y;
    }

    static class mem {
        int to, val;
    }


    static void Z_function() throws IOException {
        char[] s = nextToken().toCharArray();
        int[] z = new int[s.length];
        for (int i = 1, l = 0, r = 0; i < s.length; i++) {
            if (i <= r)
                z[i] = min(r - i + 1, z[i - l]);
            while (z[i] + i < s.length && s[z[i] + i] == s[z[i]])
                ++z[i];
            if (i + z[i] - 1 > r) {
                l = i;
                r = i + z[i] - 1;
            }
        }
        for (int i = 0; i < z.length; i++) {
            out.print(z[i] + " ");
        }
    }

    static long pow(long a, long b) {
        long h = 1;
        while (b > 0) {
            if (b % 2 != 0) {
                h *= a;
                b--;
            }
            b /= 2;
            a *= a;
        }
        return h;
    }

    static long lcm(long a, long b) {
        return a * b / gcd(a, b);
    }

    static long gcd(long a, long b) {
        return b == 0 ? a : gcd(b, a % b);
    }

    static void end(long time) {
        out.flush();
        System.err.println("seconds : " + (System.currentTimeMillis() - time) / 1000 +
                "  milliseconds : " + (System.currentTimeMillis() - time) % 1000);
        out.close();
    }

    static BufferedReader br;
    static PrintWriter out;

    static void file(String input, String output) {
        if (input.equals("")) {
            br = new BufferedReader(new InputStreamReader(System.in));
            out = new PrintWriter(System.out);
        } else {
            try {
                br = new BufferedReader(new FileReader(input));
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
            try {
                out = new PrintWriter(output);
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
        }
    }

    static StringTokenizer in = new StringTokenizer("");

    public static String nextToken() throws IOException {
        while (in == null || !in.hasMoreTokens()) {
            String s = br.readLine();
            if (s == null) return null;
            in = new StringTokenizer(s);
        }
        return in.nextToken();
    }


    public static int nextInt() throws IOException {
        return Integer.parseInt(nextToken());
    }

    public static double nextDouble() throws IOException {
        return Double.parseDouble(nextToken());
    }

    public static long nextLong() throws IOException {
        return Long.parseLong(nextToken());
    }


    public static void main(String[] args) throws IOException {
        run();
    }
}