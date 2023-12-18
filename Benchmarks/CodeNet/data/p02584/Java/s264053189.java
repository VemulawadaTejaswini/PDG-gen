import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long x = sc.nextLong();
        long k = sc.nextLong();
        long d = sc.nextLong();
        long m = Math.abs(x) / d;
        long res = Math.abs(x) - m * d;
        if (m > k) {
            res += (m - k) * d;
        } else {
            if ((k - m) % 2 != 0) {
                res -= d;
            }
        }
        System.out.println(Math.abs(res));
        sc.close();
    }
}