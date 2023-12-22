import java.util.*;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[]$) {
        int n = scanner.nextInt();
        int[] a = new int[n];
        long x = 1;
        long y = 1;
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
            x *= 3;
            y *= (a[i] % 2 ^ 1) + 1;
        }
        System.out.println(x - y);
    }
}