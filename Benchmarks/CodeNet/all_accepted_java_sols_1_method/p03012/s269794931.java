import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] w = new int[n];
        int a = 0, b = 0, ans = 20000;
        for (int i = 0; i < n; i++) {
            w[i] = sc.nextInt();
            a += w[i];
        }
        for (int i = 0; i < n; i++) {
            a -= w[i];
            b += w[i];
            ans = Math.min(ans, Math.abs(a-b));
        }
        System.out.println(ans);
    }
}