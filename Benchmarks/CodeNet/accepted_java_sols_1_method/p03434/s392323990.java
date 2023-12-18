import java.util.Arrays;
import java.util.Scanner;


public class Main {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ans = 0;

        int[] a = new int[n];

        for (int i = 0; i < n; i++)
            a[i] = sc.nextInt();

        Arrays.sort(a);

        for (int i = 0; i < n; i++) {
            if (i % 2 == 0)
                ans += a[i];
            else
                ans -= a[i];
        }

        if (n % 2 == 0)
            ans = -ans;

        System.out.println(ans);
    }
}
