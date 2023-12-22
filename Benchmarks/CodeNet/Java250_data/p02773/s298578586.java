import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        Scanner in = new Scanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        Solver solver = new Solver();
        solver.solve(in, out);
        out.close();
    }

    static class Solver {
        public void solve(Scanner in, PrintWriter out) {
            int N = in.nextInt();
            Map<String, Integer> map = new TreeMap<>();
            int max = 0;
            for (int i = 0; i < N; i++) {
                String S = in.next();
                Integer val = map.get(S);
                if (val == null) {
                    map.put(S, 1);
                    if (max <= 1) {
                        max = 1;
                    }
                }
                else {
                    map.put(S, val + 1);
                    if (max <= val + 1) {
                        max = val + 1;
                    }
                }
            }
            for (String key : map.keySet()) {
                if (map.get(key) == max) {
                    out.println(key);
                }
            }
        }
    }
}