import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, k, x, y;
        n = sc.nextInt();
        k = sc.nextInt();
        x = sc.nextInt();
        y = sc.nextInt();
        int ans = x * Math.min(k, n);
        if (n > k) ans += y * (n - k);
        System.out.println(ans);
    }
}