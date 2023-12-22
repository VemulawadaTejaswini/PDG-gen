import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0 ; i < n ; i++) {
            a[i] = sc.nextInt();
        }
        Arrays.sort(a);
        for (int i = 0 ; i < n ; i++) {
            if (x >= a[i]) {
                x -= a[i];
            } else {
                System.out.println(i);
                return;
            }
        }
        if (x == 0) {
            System.out.println(n);
        } else {
            System.out.println(n - 1);
        }

    }

}