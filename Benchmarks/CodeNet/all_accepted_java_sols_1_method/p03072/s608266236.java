import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] h = new int[n];
        for (int i = 0; i < h.length; i++) {
            h[i] = sc.nextInt();
        }
        int ans = 0;
        int t = h[0];
        for (int i = 0; i < h.length; i++) {
            if (t <= h[i]) {
                t = h[i];
                ans++;
            }
        }
        System.out.println(ans);
    }
}