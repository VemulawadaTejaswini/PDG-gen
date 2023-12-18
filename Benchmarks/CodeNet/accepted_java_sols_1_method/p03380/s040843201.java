
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        Arrays.sort(a);
        int min = Integer.MAX_VALUE;
        int ans = 0;
        for (int i = 0; i < n - 1; i++) {
            int sa = Math.abs(a[n - 1] - a[i] * 2);
            if (sa < min) {
                min = sa;
                ans = a[i];
            }
        }
        System.out.print(a[n - 1] + " ");
        System.out.println(ans);

    }
}
