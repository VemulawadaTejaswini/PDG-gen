import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        int[] aryb = new int[n - 1];
        int ans = 0;
        for (int i = 0; i < n - 1; i++) {
            int a = Integer.parseInt(sc.next());
            aryb[i] = a;
        }
        for (int i = n - 2; i >= 0; i--) {
            if (i == n - 2) {
                ans += aryb[i];
            }
            if (i == 0) {
                ans += aryb[i];
            } else {
                ans += Math.min(aryb[i], aryb[i - 1]);
            }
        }
        System.out.println(ans);
    }
}