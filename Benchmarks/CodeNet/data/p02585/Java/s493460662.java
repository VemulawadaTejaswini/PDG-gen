import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        MyScanner sc = new MyScanner();
        PrintWriter out = new PrintWriter(new BufferedOutputStream(System.out));
        int n = sc.nextInt(); long k = sc.nextLong();
        boolean [] vis = new boolean[n];
        long [] c = new long[n];
        int [] p = new int[n];
        for (int i = 0; i <n; i++) {
            p[i] = sc.nextInt() - 1;
        }
        for (int i = 0; i < n; i++) {
            c[i] = sc.nextLong();
        }
        long ans = Long.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            if (vis[i]) continue;
            ArrayList<Integer> cycle = new ArrayList<>();
            cycle.add(i); vis[i] = true; int cur = p[i]; int start = i;
            while (cur != start) {
                vis[cur] = true;
                cycle.add(cur);
                cur = p[cur];
            }
            int len = cycle.size();
            long total = 0;
            for (int j = 0; j < cycle.size(); j++) total += c[cycle.get(j)];
            long move = Math.min(len, k);
            for (int j = 0; j < cycle.size(); j++) {
                int v = cycle.get(j);
                int ct = 0; long cost = 0;
                while (ct < move) {
                    v = p[v];
                    cost += c[v];
                    ans = Math.max(ans, cost);
                    ++ct;
                    ans = Math.max(ans, cost + ((k - ct) / len) * total);
                }
                if (move == len) {

                }
            }
        }
        out.println(ans);
        out.close();
    }


    //-----------MyScanner class for faster input----------
    public static class MyScanner {
        BufferedReader br;
        StringTokenizer st;

        public MyScanner() {
            br = new BufferedReader(new InputStreamReader(System.in));
        }

        String next() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }

        long nextLong() {
            return Long.parseLong(next());
        }

        double nextDouble() {
            return Double.parseDouble(next());
        }

        String nextLine() {
            String str = "";
            try {
                str = br.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }


    }

}