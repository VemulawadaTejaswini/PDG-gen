import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Random;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.FileNotFoundException;
import java.util.StringTokenizer;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        FastScanner in = new FastScanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        DGuessThePassword solver = new DGuessThePassword();
        solver.solve(1, in, out);
        out.close();
    }

    static class DGuessThePassword {
        static String chars;
        int len = 128;

        static {
            chars = "";
            for (int i = 0; i < 26; i++) {
                chars += (char) ('A' + i);
                chars += (char) ('a' + i);
            }
            for (int i = 0; i < 10; i++) {
                chars += (char) ('0' + i);
            }
        }

        public void solve(int testNumber, FastScanner in, PrintWriter out) {
            DGuessThePassword.Interactor interactor = new StdInteractor(in, out);
            solve(interactor);
//        for (int IT = 0; IT < 1000; IT++) {
//            System.err.println(IT);
//            Interactor interactor = new StressInteractor();
//            solve(interactor);
//        }
        }

        private void solve(DGuessThePassword.Interactor interactor) {
            String cur = "";
            int finalLength = -1;
            char[] order = chars.toCharArray();
            Utils.shuffle(order, new Random(123));
            for (char c : chars.toCharArray()) {
                int count;
                {
                    char[] query = new char[len];
                    Arrays.fill(query, c);
                    count = len - interactor.ask(new String(query));
                }
                if (cur.equals("")) {
                    if (count > 0) {
                        for (int i = 0; i < count; i++) {
                            cur += c;
                        }
                        finalLength = 1 + interactor.ask("" + c);
                    }
                    continue;
                }
                int lastPos = 0;
                for (int t = 0; t < count; t++) {
                    int left = lastPos - 1, right = cur.length() + 1;
                    while (left < right - 1) {
                        int mid = (left + right) / 2;

                        StringBuilder query = new StringBuilder();
                        for (int i = 0; i < mid; i++) {
                            if (cur.charAt(i) == c) {
                                query.append(c);
                            }
                        }
                        query.append(c);
                        for (int i = mid; i < cur.length(); i++) {
                            query.append(cur.charAt(i));
                        }

                        int dist = interactor.ask(query.toString());
                        if (query.length() + dist == finalLength) {
                            right = mid;
                        } else {
                            left = mid;
                        }
                    }

                    if (left == cur.length()) {
                        break;
                    } else {
                        cur = cur.substring(0, right) + c + cur.substring(right);
                        lastPos = right + 1;
                    }
                }
            }
            interactor.answer(cur);
        }

        interface Interactor {
            int ask(String s);

            void answer(String s);

        }

        class StdInteractor implements DGuessThePassword.Interactor {
            FastScanner in;
            PrintWriter out;

            public StdInteractor(FastScanner in, PrintWriter out) {
                this.in = in;
                this.out = out;
            }

            public int ask(String s) {
                out.println("? " + s);
                out.flush();
                return in.nextInt();
            }

            public void answer(String s) {
                out.println("! " + s);
                out.flush();
            }

        }

    }

    static class FastScanner {
        public BufferedReader br;
        public StringTokenizer st;

        public FastScanner(InputStream in) {
            br = new BufferedReader(new InputStreamReader(in));
        }

        public FastScanner(String fileName) {
            try {
                br = new BufferedReader(new FileReader(fileName));
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
        }

        public int nextInt() {
            return Integer.parseInt(next());
        }

        public String next() {
            while (st == null || !st.hasMoreElements()) {
                String line = null;
                try {
                    line = br.readLine();
                } catch (IOException e) {
                }
                st = new StringTokenizer(line);
            }
            return st.nextToken();
        }

    }

    static class Utils {
        public static void shuffle(char[] b, Random rng) {
            for (int i = 1; i < b.length; i++) {
                int pos = rng.nextInt(i + 1);
                char tmp = b[i];
                b[i] = b[pos];
                b[pos] = tmp;
            }
        }

    }
}

