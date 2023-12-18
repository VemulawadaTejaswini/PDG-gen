import java.util.Arrays;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; ++i) {
            a[i] = sc.nextInt();
        }

        int ans = 0;
        Arrays.sort(a);
        for (int i = 0; i < k; ++i) {
            ans += a[n - i - 1];
        }

        System.out.println(ans);
    }
}