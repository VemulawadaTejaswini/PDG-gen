import java.util.Scanner;


// 152_b
public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        boolean[] n_ac = new boolean[n];
        int[] n_wa = new int[n];
        for (int i = 0; i < n; i++) {
            n_ac[i] = false;
            n_wa[i] = 0;
        }
        for (int i = 0; i < n; i++) {
            n_ac[i] = false;
        }
        int m = sc.nextInt();

        int seitou = 0;
        int pena = 0;

        for (int i = 0; i < m; i++) {
            int pi = sc.nextInt();
            String s1 = sc.next();
            if (n_ac[pi - 1]) {
                continue;
            }
            if ("AC".equals(s1)) {
                n_ac[pi - 1] = true;
                seitou++;
                pena += n_wa[pi - 1];
            }
            if ("WA".equals(s1)) {
                n_wa[pi - 1]++;
            }
        }

        out(seitou + " " + pena);

    }

    /*
     * 以下メソッド集
     */

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

}
