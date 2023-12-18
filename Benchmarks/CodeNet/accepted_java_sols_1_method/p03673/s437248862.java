import java.util.*;
import java.lang.*;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        if (n % 2 == 0) {
            a[n / 2] = sc.nextInt();
            for (int i = 1; i < n / 2; i++) {
                a[n / 2 - i] = sc.nextInt();
                a[n / 2 + i] = sc.nextInt();
            }
            a[0] = sc.nextInt();
            for (int i = 0; i < n; i++) {
                System.out.print(a[i]);
                System.out.print(" ");
            }
        } else {
            a[n / 2] = sc.nextInt();
            for (int i = 1; i <= n / 2; i++) {
                a[n / 2 - i] = sc.nextInt();
                a[n / 2 + i] = sc.nextInt();
            }
            for (int i = n - 1; i >= 0; i--) {
                System.out.print(a[i]);
                System.out.print(" ");
            }
        }
        System.out.println();
    }
}