
import java.io.*;
import java.util.*;

public class Main {
    private static final boolean N_CASE = false;

    private int bs1(List<Integer> a, int x) {
        int left = 0, right = a.size() - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (a.get(mid) > x) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return right;
    }

    private int bs2(List<Integer> a, int x) {
        int left = 0, right = a.size() - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (a.get(mid) >= x) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return left;
    }

    private void solve() {
        int N = sc.nextInt();

        List<Integer> A = new ArrayList<>();
        List<Integer> B = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            A.add(sc.nextInt());
            B.add(sc.nextInt());
        }

        List<Integer> s = new ArrayList<>();
        s.addAll(A);
        s.addAll(B);

        Collections.sort(s);
        Collections.sort(A);
        Collections.sort(B);

        int M = (N + 1) / 2;
        long ans = 0;
        for (int i = 1; i < s.size(); ++i) {
            int c1 = bs1(A, s.get(i - 1)) + 1;
            int c2 = N - bs2(B, s.get(i));

           // System.out.println(s.get(i - 1) + " " + s.get(i) + " " + c1 + " " + c2);
            if (c1 >= M && c2 >= M) {
                ans += s.get(i) - s.get(i -1);
            }
        }
        ans += ans == 0 ? 0 : 1;
        out.println(ans);
    }

    private void run() {
        int T = N_CASE ? sc.nextInt() : 1;
        for (int t = 0; t < T; ++t) {
            solve();
        }
    }

    private static MyWriter out;
    private static MyScanner sc;

    private static class MyScanner {
        BufferedReader br;
        StringTokenizer st;

        private MyScanner() {
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

        int[] nextArray(int n) {
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = nextInt();
            }
            return a;
        }

        List<Integer> nextList(int n) {
            List<Integer> list = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                list.add(nextInt());
            }
            return list;
        }
    }

    private static class MyWriter extends PrintWriter {
        private MyWriter(OutputStream outputStream) {
            super(outputStream);
        }

        void printArray(int[] a) {
            for (int i = 0; i < a.length; ++i) {
                print(a[i]);
                print(i == a.length - 1 ? '\n' : ' ');
            }
        }

        void printlnArray(int[] a) {
            for (int v : a) {
                println(v);
            }
        }

        void printList(List<Integer> list) {
            for (int i = 0; i < list.size(); ++i) {
                print(list.get(i));
                print(i == list.size() - 1 ? '\n' : ' ');
            }
        }

        void printlnList(List<Integer> list) {
            list.forEach(this::println);
        }
    }

    public static void main(String[] args) {
        out = new MyWriter(new BufferedOutputStream(System.out));
        sc = new MyScanner();
        new Main().run();
        out.close();
    }
}