import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] h = new int[n];
        for (int i = 0;i < n; i++) {
            h[i] = sc.nextInt();
        }

        int[] a = new int[n];
        a[0] = 0;
        int max = 0;
        for (int i = 1;i < n; i++) {
            if (h[i] <= h[i-1]) {
                a[i] = a[i - 1] + 1;
                max  = Math.max(max, a[i]);
            } else {
                a[i] = 0;
            }
        }

        System.out.println(max);

    }
}
