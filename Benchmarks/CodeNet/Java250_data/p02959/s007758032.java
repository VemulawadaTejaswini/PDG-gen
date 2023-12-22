import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[] a = new long[n + 1];
        long[] b = new long[n];
        for (int i = 0; i < n + 1; i++) {
            a[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            b[i] = sc.nextInt();
        }

        long fii1 = 0;
        long sum = 0;
        for (int i = 0; i < n; i++) {
            long fii = Math.min(a[i] - fii1, b[i]);
            fii1 = Math.min(a[i + 1], b[i] - fii);
            sum += fii + fii1;
        }
        System.out.println(sum);
    }

}

