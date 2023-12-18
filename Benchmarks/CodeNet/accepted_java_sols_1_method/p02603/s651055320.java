import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) a[i] = scan.nextInt();
        long ans = 1000L;
        int i = 0;
        while (i < n) {
            int j = i;
            while (j + 1 < n && a[j] <= a[j + 1]) j++;
            ans += ans / a[i] * (a[j] - a[i]);
            i = j + 1;
        }
        System.out.println(ans);
    }
}
