import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        double root = Math.sqrt(n);
        long ans = n;
        for (int i = 1; i < root + 1; i++) {
            if (n % i != 0) {
                continue;
            }
            long l = i;
            long r = n / i;
            ans = Math.min(ans, l + r - 2);
        }
        System.out.println(ans);

        sc.close();
    }
}
