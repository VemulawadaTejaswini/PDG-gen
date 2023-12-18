
import java.math.BigInteger;
import java.util.*;

public class Main {
    static Scanner scanner;

    public static void main(String[] args) {
        scanner = new Scanner(System.in);
        String n = scanner.next();
        BigInteger bi = new BigInteger(n);
        String res = bi.toString(26);
        //int dec = Integer.parseInt(n, 10);
        //String res = Integer.toString(dec, 26);
        StringBuilder ret = new StringBuilder();
        for (char c : res.toCharArray()) {
            char a = getChar(c);
            if (a == 'z') {
                if (ret.length() == 0) {
                    ret.append('z');
                } else {
                    ret.setCharAt(ret.length()-1,'z');
                }
            } else {
                ret.append(a);
            }
        }
        System.out.println(ret.toString());
    }

    static char getChar(char a) {
        switch (a){
            case '1':
                return 'a';
            case '2':
                return 'b';
            case '3':
                return 'c';
            case '4':
                return 'd';
            case '5':
                return 'e';
            case '6':
                return 'f';
            case '7':
                return 'g';
            case '8':
                return 'h';
            case '9':
                return 'i';
            case 'a':
                return 'j';
            case 'b':
                return 'k';
            case 'c':
                return 'l';
            case 'd':
                return 'm';
            case 'e':
                return 'n';
            case 'f':
                return 'o';
            case 'g':
                return 'p';
            case 'h':
                return 'q';
            case 'i':
                return 'r';
            case 'j':
                return 's';
            case 'k':
                return 't';
            case 'l':
                return 'u';
            case 'm':
                return 'v';
            case 'n':
                return 'w';
            case 'o':
                return 'x';
            case 'p':
                return 'y';
            case '0':
                return 'z';
        }
        return ' ';
    }


    public static void println(Object o) {
        System.out.println(o);
    }

    public static void print(Object o) {
        System.out.print(o);
    }

    public static void printf(String format, Object... o) {
        System.out.printf(format, o);
    }

    public static int nextInt() {
        return Integer.parseInt(scanner.next());
    }

    public static long nextLong() {
        return Long.parseLong(scanner.next());
    }

    public static double nextDouble() {
        return Double.parseDouble(scanner.next());
    }

    public static short nextShort() {
        return Short.parseShort(scanner.next());
    }

    public static float nextFloat() {
        return Float.parseFloat(scanner.next());
    }

    public static void printYes() {
        System.out.println("Yes");
    }

    public static void printYES() {
        System.out.println("YES");
    }

    public static void printNo() {
        System.out.println("No");
    }

    public static void printNO() {
        System.out.println("NO");
    }

    public static void nextLine() {
        scanner.nextLine();
    }

    public static double distance(double x, double y, double x2, double y2) {
        return Math.sqrt((x2 - x) * (x2 - x) + (y2 - y) * (y2 - y));
    }

    public static int MOD = 1_000_000_007;
    public static int MAX = 100000;
    public static long[] fac = new long[MAX];
    public static long[] finv = new long[MAX];
    public static long[] inv = new long[MAX];

    public static void combinit() {
        fac[0] = fac[1] = 1;
        finv[0] = finv[1] = 1;
        inv[1] = 1;
        for (int i = 2; i < MAX; i++) {
            fac[i] = fac[i - 1] * i % MOD;
            inv[i] = MOD - inv[MOD % i] * (MOD / i) % MOD;
            finv[i] = finv[i - 1] * inv[i] % MOD;
        }
    }

    public static long combination(int n, int k) {
        if (n < k || n < 0 || k < 0) return 0;
        return fac[n] * (finv[k] * finv[n - k] % MOD) % MOD;
    }

    public static long factorial(long n) {
        return n <= 0 ? 1 : n * factorial(n - 1);
    }
}