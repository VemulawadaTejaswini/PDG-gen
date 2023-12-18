import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[] a = new long[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextLong();
        }
        long sum = 0;
        for (int i = 1; i < n; i++) {
            if (a[i] < a[i - 1]) {
                sum += (a[i - 1] - a[i]);
                a[i] = a[i - 1];
            }
        }
        System.out.println(sum);
    }
}
