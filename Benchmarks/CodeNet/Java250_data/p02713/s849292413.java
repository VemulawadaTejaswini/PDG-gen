import java.util.*;

class Main {

    static int gcd(int a, int b) {
        return b > 0 ? gcd(b, a % b) : a;
    }

    static int lcm(int a, int b) {
        return a * b / gcd(a, b);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();

        long res = 0;
        for (int i = 1; i <= k; i++) {
            for (int j = 1; j <= k; j++) {
                for (int l = 1; l <= k; l++) {
                    res += gcd(i, gcd(j, l));
                    // System.out.println("i:" + i + ",j:" + j + ",l:" + l + "," + res);
                }
            }
        }

        System.out.println(res);
        sc.close();
    }
}
