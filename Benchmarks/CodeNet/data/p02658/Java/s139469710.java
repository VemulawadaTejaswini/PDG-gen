import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        long result = 1;
        long max = (long) Math.pow(10, 18);
        for (int i = 0; i < n; i++) {
            long x = sc.nextLong();

            if (x == 0) {
                System.out.println(0);
                return;
            }

            result *= x;
            if (result > max) {
                System.out.println(-1);
                return;
            }
        }
        System.out.println(result);
    }
}