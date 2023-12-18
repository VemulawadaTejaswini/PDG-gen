import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.HashSet;
import java.util.Arrays;
import java.util.Scanner;

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
        UnknownSwitches solver = new UnknownSwitches();
        try {
            int testNumber = 1;
            while (true)
                solver.solve(testNumber++, in, out);
        } catch (UnknownError e) {
            out.close();
        }
    }

    static class UnknownSwitches {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            final int N = in.nextInt();
            final int M = in.nextInt();
            final int Q = in.nextInt();
            if (N == 0 && M == 0 && Q == 0) throw new UnknownError();
            String[] S = new String[Q + 1];
            String[] B = new String[Q + 1];
            S[0] = new String();
            for (int i = 0; i < N; i++) {
                S[0] += "0";
            }
            B[0] = new String();
            for (int i = 0; i < M; i++) {
                B[0] += "0";
            }
            for (int i = 0; i < Q; i++) {
                S[i + 1] = in.next();
                B[i + 1] = in.next();
            }
            String ans = "";
            for (int i = 0; i < M; i++) {
                ans += "?";
            }
            StringBuilder buildAns = new StringBuilder(ans);
            boolean[] isHatena = new boolean[M];
            boolean[] visited = new boolean[N];
            Arrays.fill(isHatena, false);
            Arrays.fill(visited, false);
            for (int i = 0; i < N; i++) {
                HashSet<Integer> set = new HashSet<>();
                boolean first = true;
                for (int j = 1; j <= Q; j++) {
                    if (S[j].charAt(i) == '1') {
                        visited[i] = true;
                        HashSet<Integer> bufset = new HashSet<>();
                        for (int k = 0; k < M; k++) {
                            if (B[j - 1].charAt(k) != B[j].charAt(k)) {
                                if (first) {
                                    set.add(k);
                                } else {
                                    bufset.add(k);
                                }
                            }
                        }
                        if (!first) {
                            HashSet<Integer> remset = new HashSet<>();
                            for (int e : set) {
                                if (!bufset.contains(e)) {
                                    remset.add(e);
                                }
                            }
                            for (int e : remset) {
                                set.remove(e);
                            }
                        } else {
                            first = false;
                        }
                    }
                }
                for (int e : set) {
                    if (!isHatena[e] && buildAns.charAt(e) == '?') {
                        buildAns.setCharAt(e, cc(i));
                    } else {
                        isHatena[e] = true;
                    }
                }
            }
            int notVisit = -1;
            for (int i = 0; i < N; i++) {
                if (!visited[i]) {
                    if (notVisit == -1) {
                        notVisit = i;
                    } else {
                        notVisit = -2;
                    }
                }
            }
            if (notVisit >= 0) {
                for (int i = 0; i < M; i++) {
                    if (!isHatena[i] && buildAns.charAt(i) == '?') {
                        buildAns.setCharAt(i, cc(notVisit));
                    }
                }
            }
            out.println(buildAns);
        }

        char cc(int n) {
            if (0 <= n && n <= 9) return (char) (n + '0');
            else return (char) (n - 10 + 'A');
        }

    }
}