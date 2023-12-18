import java.io.*;
import java.util.*;

public class Main {
    FastScanner in;
    PrintWriter out;

    final int MAX_LEN = 128;
    final int ALPH = 62;

    String alph() {
        StringBuilder alph = new StringBuilder();
        for (char c = 'a'; c <= 'z'; c++) {
            alph.append(c);
        }
        for (char c = 'A'; c <= 'Z'; c++) {
            alph.append(c);
        }
        for (char c = '0'; c <= '9'; c++) {
            alph.append(c);
        }
        return alph.toString();
    }

    int ask(String s) {
        out.println("? " + s);
        out.flush();
        return in.nextInt();
    }

    boolean good(String s) {
        int r = ask(s);
        return r == len - s.length();
    }

    String combine(String s1, String s2) {
        int posToPut = 0;
//        System.err.println("combine: " + s1 + " " + s2);
        for (char c : s2.toCharArray()) {
            while (true) {
                String ask = s1.substring(0, posToPut) + c + s1.substring(posToPut);
                if (good(ask)) {
                    s1 = ask;
                    posToPut++;
                    break;
                } else {
                    posToPut++;
                }
            }
        }
        return s1 + s2;
    }

    int len;

    void solve() {
        String alph = alph();
        char[] ask = new char[MAX_LEN];
        List<String> joins = new ArrayList<>();
        len = 0;
        for (char c : alph.toCharArray()) {
            Arrays.fill(ask, c);
            int dist = ask(new String(ask));
            char[] tmp = new char[MAX_LEN - dist];
            Arrays.fill(tmp, c);
            if (tmp.length != 0) {
                joins.add(new String(tmp));
            }
            len += tmp.length;
        }
//        System.err.println("len - " + len);
        while (joins.size() > 1) {
            Collections.sort(joins, new Comparator<String>() {
                @Override
                public int compare(String o1, String o2) {
                    return Integer.compare(o1.length(), o2.length());
                }
            });
            String s1 = joins.get(0);
            String s2 = joins.get(1);
            joins.remove(0);
            joins.remove(0);
            joins.add(combine(s1, s2));
        }
        String s = joins.get(0);
        out.println("! " + s);
    }

    void solve22() {
        int[] cnt = new int[ALPH];
        Random rnd = new Random(444);
        for (int i = 0; i < MAX_LEN; i++) {
            cnt[rnd.nextInt(cnt.length)]++;
        }
        List<Integer> sz = new ArrayList<>();
        for (int i : cnt) {
            if (i == 0) {
                continue;
            }
            sz.add(i);
        }
        int used = ALPH;
        while (sz.size() > 1) {
            Collections.sort(sz);
            int m1 = sz.get(0), m2 = sz.get(1);
            sz.remove(0);
            sz.remove(0);
            sz.add(m1 + m2);
            used += m1 + m2;
        }
        System.err.println("!" + used);
    }


    final int mod = 988244353;

    int mul(int x, int y) {
        return (int) ((x * 1L * y) % mod);
    }

    void run() {
        try {
            in = new FastScanner(new File("Main.in"));
            out = new PrintWriter(new File("Main.out"));

            solve();

            out.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    void runIO() {

        in = new FastScanner(System.in);
        out = new PrintWriter(System.out);

        try {
            solve();
        } catch (AssertionError e) {

        }
        out.close();
    }

    class FastScanner {
        BufferedReader br;
        StringTokenizer st;

        public FastScanner(File f) {
            try {
                br = new BufferedReader(new FileReader(f));
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
        }

        public FastScanner(InputStream f) {
            br = new BufferedReader(new InputStreamReader(f));
        }

        String next() {
            while (st == null || !st.hasMoreTokens()) {
                String s = null;
                try {
                    s = br.readLine();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                if (s == null)
                    return null;
                st = new StringTokenizer(s);
            }
            return st.nextToken();
        }

        boolean hasMoreTokens() {
            while (st == null || !st.hasMoreTokens()) {
                String s = null;
                try {
                    s = br.readLine();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                if (s == null)
                    return false;
                st = new StringTokenizer(s);
            }
            return true;
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
    }

    public static void main(String[] args) {
        new Main().runIO();
    }
}