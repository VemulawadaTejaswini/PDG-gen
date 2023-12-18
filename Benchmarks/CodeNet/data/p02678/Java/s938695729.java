import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;


public class Main {

    public static String Y = "Yes";
    public static String N = "No";
    public static String I = "IMPOSSIBLE";
    public static String B = "Bad";
    public static String G = "Good";
    public static long MOD = (long) (Math.pow(10, 9) + 7);
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        int n = ni();
        int m = ni();

        boolean[][] tunagari = new boolean[n + 300][n + 300];

        Deque<Integer> q = new ArrayDeque<>();

        int[] ans = new int[n + 200];
        ans[0] = -1;
        ans[1] = -1;

        for (int i = 1; i <= m; i++) {
            int a = ni();
            int b = ni();
            tunagari[a][b] = true;
            tunagari[b][a] = true;

            if (min(a, b) == 1) {
                q.add(max(a, b));
                ans[max(a, b)] = 1;
            }

        }

        for (;;) {

            if (q.size() < 1) {
                break;
            }

            int tar = q.poll();

            for (int i = 2; i <= n; i++) {
                if (tunagari[tar][i] && ans[i] == 0) {
                    q.offer(i);
                    ans[i] = tar;
                }
            }

        }

        boolean flg = false;
        for (int i = 2; i <= n; i++) {
            if (ans[i] == 0) {
                flg = true;
            }
        }

        if (flg) {
            out(N);
        } else {
            out(Y);
            for (int i = 2; i <= n; i++) {
                out(ans[i]);
            }

        }

    }

    public static int count(String search, String text) {

        int nsearch = search.length();
        int ntext = text.length();
        int count = 0;

        for (int i = 0; i <= ntext - nsearch + 1; i++) {
            for (int j = i + nsearch - 1; j < ntext; j++) {
                if (search.equals(text.substring(i, j + 1))) {
                    count++;
                }
            }
        }

        return count;
    }

    /*
     * 以下メソッド集
     */
    static int ni() {

        return sc.nextInt();
    }

    static long nl() {

        return sc.nextLong();
    }

    static double nd() {

        return sc.nextDouble();
    }

    static String n() {

        return sc.next();
    }

    static char[] nc() {

        return sc.next().toCharArray();
    }

    static int kaijo(int n) {

        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * kaijo(n - 1);
        }
    }

    static int fib(int n) {

        return (n == 1 || n == 0) ? n : fib(n - 2) + fib(n - 1);
    }

    static long lcm(long m, long n) {

        return m * n / gcd(m, n);
    }

    static int lcm(int m, int n) {

        return m * n / gcd(m, n);
    }

    static long gcd(long a, long b) {

        return (b == 0) ? a : gcd(b, a % b);
    }

    static int gcd(int a, int b) {

        return (b == 0) ? a : gcd(b, a % b);
    }

    static void out(String info) {

        System.out.println(info);
    }

    static void out(int info) {

        System.out.println(info);
    }

    static void out(double info) {

        System.out.println(info);
    }

    static void out(long info) {

        System.out.println(info);
    }

    static void out(char info) {

        System.out.println(info);
    }

    static void outn(String info) {

        System.out.print(info);
    }

    static void outn(int info) {

        System.out.print(info);
    }

    static void outn(double info) {

        System.out.print(info);
    }

    static void outn(long info) {

        System.out.print(info);
    }

    static void outn(char info) {

        System.out.print(info);
    }

    static int max(int a, int b) {

        return Math.max(a, b);
    }

    static long max(long a, long b) {

        return Math.max(a, b);
    }

    static int min(int a, int b) {

        return Math.min(a, b);
    }

    static long min(long a, long b) {

        return Math.min(a, b);
    }
}


class INF {

    int a;
    int d;

    INF(int a, int d) {
        this.a = a;
        this.d = d;
    }
}
