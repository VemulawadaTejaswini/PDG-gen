import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.StringTokenizer;
import java.util.HashMap;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        inputClass in = new inputClass(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        DNotDivisible solver = new DNotDivisible();
        solver.solve(1, in, out);
        out.close();
    }

    static class DNotDivisible {
        public void solve(int testNumber, inputClass sc, PrintWriter out) {
            int n = sc.nextInt();
            Integer[] tab = new Integer[n];
            HashMap<Integer, Integer> map = new HashMap<>();
            for (int i = 0; i < n; i++) {
                tab[i] = sc.nextInt();
                map.putIfAbsent(tab[i], 0);
                map.put(tab[i], map.get(tab[i]) + 1);
            }
            Arrays.sort(tab);
            HashMap<Integer, Integer> done = new HashMap<>();
            int ans = 0;
            for (int i = 0; i < n; i++) {
                if (map.get(tab[i]) == 1) {
                    if (done.get(tab[i]) == null) {
                        ans++;
                    }
                }
                if (done.get(tab[i]) == null) {
                    for (int j = tab[i]; j < 1000001; j += tab[i]) {
                        done.put(j, 1);
                    }
                }
            }
            out.println(ans);
        }

    }

    static class inputClass {
        BufferedReader br;
        StringTokenizer st;

        public inputClass(InputStream in) {

            br = new BufferedReader(new InputStreamReader(in));
        }

        public String next() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        public int nextInt() {
            return Integer.parseInt(next());
        }

    }
}

