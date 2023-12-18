
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        long[] a = new long[n];
        for (int i = 0 ; i < n ; i++) {
            a[i] = sc.nextLong();
        }
        for (int i = 0 ; i < n - k; i++) {
            if (a[i] <  a[i + k]) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }
    }

}
