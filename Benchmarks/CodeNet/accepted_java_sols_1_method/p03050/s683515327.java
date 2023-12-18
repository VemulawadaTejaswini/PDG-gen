import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long ans = 0;
        for (long m = 1; m * m < n; m++) {
            if ((n - m) % m == 0) {
                if ((n - m) == 1) {
                    continue;
                }
                long tmp = (n - m) / m;
                if (tmp > m) {
                    ans += tmp;
                }

            }
        }
        System.out.println((ans));
        sc.close();
    }
}