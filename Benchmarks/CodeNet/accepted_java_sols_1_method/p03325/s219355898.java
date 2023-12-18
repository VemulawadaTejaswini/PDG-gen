import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        long[] a = new long[n];
        for (int i = 0; i < n; i++) {
            a[i] = in.nextLong();
        }

        int ans = 0;
        for (int i = 0; i < n; i++) {
            while (a[i] % 2 == 0) {
                a[i] /= 2;
                ans++;
            }
        }

        System.out.println(ans);
    }
}