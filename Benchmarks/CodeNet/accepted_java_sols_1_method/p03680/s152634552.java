import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        int b = 1;
        int count = 0;
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            if (b == a[b - 1]) {
                System.out.println(-1);
                System.exit(0);
            }
            b = a[b - 1];
            count++;
            if (b == 2) {
                System.out.println(count);
                System.exit(0);
            }
        }
        System.out.println(-1);
    }
}
