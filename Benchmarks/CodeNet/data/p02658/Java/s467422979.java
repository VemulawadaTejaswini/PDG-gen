import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        long a[] = new long[n];
        for (int i = 0; i < n; i++) {
            a[i] = in.nextLong();
        }

        long sum = 1;
        boolean zero = false;
        boolean over = false;
        for (int i = 0; i < n; i++) {
            sum *= a[i];
            if (sum >= 1000000000000000000L) {
                over = true;
            }
            if (a[i] >= 1000000000000000000L) {
                over = true;
            }
            if (sum < 0) {
                over = true;
            }
            if (a[i] == 0) {
                zero = true;
            }
        }

        if (zero) {
            System.out.println(0);
        } else if (over) {
            System.out.println(-1);
        } else {
            System.out.println(sum);
        }
    }
}