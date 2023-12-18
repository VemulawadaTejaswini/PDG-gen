import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String xStr = sc.next();
        int x = 0;
        for (int i = xStr.length() - 1; i >= 0; i--) {
            int place = xStr.length() - 1 - i;
            if (xStr.charAt(i) == '1') {
                x += Math.pow(2, place);
            }
        }

        for (int i = 1; i <= n; i++) {
            int xi = x ^ (1 << (n - i));
            System.out.println(f(xi));
        }
    }

    private static int popcount(int x) {
        int ones = 0;
        int x1 = x;
        while (x1 > 0) {
            ones += x1 & 1;
            x1 >>= 1;
        }
        return x % ones;
    }

    private static int f(int x) {
        int times = 0;
        while (x > 0) {
            x = popcount(x);
            times++;
        }
        return times;
    }
}
