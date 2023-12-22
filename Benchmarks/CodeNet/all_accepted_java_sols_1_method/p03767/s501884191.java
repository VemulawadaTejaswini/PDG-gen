import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[3*n];
        for (int i = 0; i < 3 * n; i++) {
            a[i] = sc.nextInt();
        }
        Arrays.sort(a);
        long ans = 0;
        for (int i = 0; i < n; i++) {
            ans += (long) a[3*n - 2 - 2 * i];
        }
        System.out.println(ans);
    }
}