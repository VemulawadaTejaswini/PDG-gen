import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[] a = new long[n];

        long sum = 0;
        long sumMulti = 0;
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextLong();
            sum += a[i];
            sumMulti += a[i] * a[i];
        }

        long ans = (((sum * sum) - sumMulti) / 2) % 1000000007;
        System.out.println(ans);
    }
}
