import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long a[] = new long[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        sc.close();

        long b[] = new long[n];
        b[0] = 0;
        for (int i = 1; i < n; i++) {
            if (a[i - 1] <= a[i]) {
                b[i] = 0;
            } else {
                b[i] = a[i - 1] - a[i];
            }
            a[i] += b[i];
        }

        long sum = 0;
        for (int i = 0; i < n; i++) {
            sum += b[i];
        }
        System.out.println(sum);
    }
}
