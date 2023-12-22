import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;
import java.util.HashMap;

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
        GreenBin solver = new GreenBin();
        solver.solve(1, in, out);
        out.close();
    }

    static class GreenBin {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int n = in.nextInt();
            HashMap<String, Integer> set = new HashMap<>();
            for (int i = 0; i < n; i++) {
                char[] chars = in.next().toCharArray();
                Arrays.sort(chars);
                StringBuilder sb = new StringBuilder();
                sb.append(chars);
                set.put(Arrays.toString(chars), set.getOrDefault(Arrays.toString(chars), 0) + 1);
            }

            long result = 0;
            for (String key : set.keySet()) {
                int a = set.get(key);
                result += (long) a * (a - 1) / 2;
            }
            out.println(result);
        }

    }
}

