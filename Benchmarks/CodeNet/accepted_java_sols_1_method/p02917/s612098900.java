import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] b = new int[n - 1];
        for (int i = 0 ; i < n - 1 ; i++) {
            b[i] = sc.nextInt();
        }
        int max = 0;
        int[] a = new int[n];
        a[0] = b[0];
        for (int i = 1 ; i < n - 1 ; i++) {
            a[i] = Math.min(b[i - 1], b[i]);
        }
        a[n - 1] = b[n - 2];
        int sum = 0;
        for (int i = 0 ; i < n ; i++) {
            sum += a[i];
        }
        System.out.println(sum);
    }

}