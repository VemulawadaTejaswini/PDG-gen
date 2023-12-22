import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] h = new int[n];
        for (int i = 0; i < n; i++) {
            h[i] = in.nextInt();
        }

        int mx = 0;
        int cur = 0;
        for (int i = 0; i < n - 1; i++) {
            if (h[i] >= h[i + 1]) {
                cur++;
            } else {
                mx = Math.max(cur, mx);
                cur = 0;
            }
        }
        mx = Math.max(cur, mx);
        System.out.println(mx);
    }
}