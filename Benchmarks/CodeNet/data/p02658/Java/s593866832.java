import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[] a = new long[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextLong();
        }
        for (int i = 0; i < n; i++) {
            if (a[i] == 0) {
                System.out.println(0);
                return;
            }
        }
        long sum = 1;
        for (int i = 0; i < n; i++) {
            if ((double) sum / Long.MAX_VALUE >= a[i]) {
                System.out.println(-1);
                return;
            }
            sum *= a[i];
            if (sum > 1000000000000000000L) {
                System.out.println(-1);
                return;
            }
        }
        System.out.println(sum);
    }

}
