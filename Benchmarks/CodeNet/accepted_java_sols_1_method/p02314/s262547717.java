import java.util.Arrays;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt(), n = sc.nextInt(), c[] = new int[n], a[] = new int[m + 1];
        for (int i = 0; i < n; i++) {
            c[i] = sc.nextInt();
        }
        Arrays.fill(a, Integer.MAX_VALUE);
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= m / c[i]; j++) {
                    a[c[i] * j] =Math.min(a[c[i]*j], j);
            }
        }
        for (int i = 0; i <= m; i++) {
            for (int j = 0; j <= m - i; j++) {
                    a[i + j] = Math.min(a[i + j] , a[i] + a[j]);
            }
        }
        System.out.println(a[m]);
    }
}
