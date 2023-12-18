import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0 ; i < n ; i++) {
            a[i] = sc.nextInt();
        }
        int[] b = new int[n];
        for (int i = 0 ; i < n - 1 ; i++) {
            b[i] = a[i + 1] - a[i];
        }
        b[n - 1] = k - a[n - 1] + a[0];
        Arrays.sort(b);
        System.out.println(k - b[n - 1]);
    }

}