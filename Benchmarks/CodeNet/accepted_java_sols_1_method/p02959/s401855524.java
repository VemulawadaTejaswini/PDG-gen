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

        long sum = 0;
        for (int i = 0; i < b.length; i++) {
            if (b[i] - a[i] > 0) {
                sum += a[i];
                b[i] -= a[i];
                a[i] = 0;
                if (b[i] - a[i + 1] > 0) {
                    sum += a[i + 1];
                    b[i] -= a[i + 1];
                    a[i + 1] = 0;
                } else {
                    sum += b[i];
                    a[i + 1] -= b[i];
                    b[i] = 0;
                }
            } else {
                sum += b[i];
                a[i] -= b[i];
                b[i] = 0;
            }
        }
        System.out.println(sum);
    }

}

