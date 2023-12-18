import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    private static Scanner sc;

    public static void main(final String[] args) {
        final Main instance = new Main();
        sc = instance.new Scanner();
        instance.solve();
    }

    private class Scanner {
        String[] s;
        int i;
        BufferedReader br;
        String regex = " ";

        public Scanner() {
            s = new String[0];
            i = 0;
            br = new BufferedReader(new InputStreamReader(System.in));
        }

        @Override
        protected void finalize() throws Throwable {
            try {
                super.finalize();
            } finally {
                destruction();
            }
        }

        private void destruction() throws IOException {
            if (br != null)
                br.close();
        }

        public String next() throws IOException {
            if (i < s.length)
                return s[i++];
            String st = br.readLine();
            while (st == "")
                st = br.readLine();
            s = st.split(regex, 0);
            i = 0;
            return s[i++];
        }

        public int nextInt() throws NumberFormatException, IOException {
            return Integer.parseInt(next());
        }

        public Long nextLong() throws NumberFormatException, IOException {
            return Long.parseLong(next());
        }

        public Double nextDouble() throws NumberFormatException, IOException {
            return Double.parseDouble(next());
        }
    }

    private void solve() {
        try {
            int n;
            int a;
            int no_leaf = 2;
            long node = 0;
            boolean isError = false;
            n = sc.nextInt();
            a = sc.nextInt();
            if (n > 1) {
                ArrayList<Integer> list = new ArrayList<>();
                int sum = 0;
                try {
                    while (true) {
                        list.add(sc.nextInt());
                    }
                } catch (final Exception e) {

                }
                for (int i = 0; i < list.size(); i++) {
                    sum += list.get(i);
                }
                node++;
                for (int i = 0; i < n; i++) {
                    a=list.get(i);
                    no_leaf -= a;
                    sum -= a;
                    if (no_leaf < 0) {
                        isError = true;
                        break;
                    }
  
                    if (no_leaf * 2 >= sum) {
                        node += a + no_leaf;
                        no_leaf = sum;

                    } else {
                        node += a + no_leaf;
                        no_leaf *=2;
                    }
                }

                if (isError) {
                    System.out.println("-1");
                } else {
                    System.out.println(node);
                }

            } else {
                if (a == 0)
                    System.out.println("1");
                else
                    System.out.println("-1");
            }

            System.out.println();

        } catch (

        final Exception e) {
            e.printStackTrace();
        }
    }
}