import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        boolean pair = true;
        for (int i = 0; i < n - 1; i++) {
            if (gcd(a[i], a[i + 1]) != 1) {
                pair = false;
                break;
            }
        }
        boolean set = (gcd(a) == 1);
        if (pair) {
            System.out.println("pairwise coprime");
        } else if (set) {
            System.out.println("setwise  coprime");
        } else {
            System.out.println("not  coprime");
        }
    }

    public static int gcd(int a, int b) {
        return b == 0 ? a : gcd(b, a % b);
    }

    public static final int gcd(int[] param) {
        int g = gcd(param[0], param[1]);
        for (int i = 1; i < param.length - 1; i++) {
            g = gcd(g, param[i + 1]);
        }
        return g;
    }
}
