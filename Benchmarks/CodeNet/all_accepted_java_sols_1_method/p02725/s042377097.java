import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = Integer.parseInt(sc.next());
        int n = Integer.parseInt(sc.next());
        int[] a = new int[n];
        int sub = 0;
        int bef = 0;
        int temp = 0;
        int idx = 0;
        for (int i = 0; i < n; i++) {
            temp = Integer.parseInt(sc.next());
            if (i != 0 && sub < temp - bef) {
                sub = temp - bef;
                idx = i - 1;
            }
            if (i == n - 1) {
                if (sub < Math.abs(k - temp + a[0])) {
                    idx = i;
                }
            }
            bef = temp;
            a[i] = temp;
        }
        int ans = 0;
        for (int i = 0; i < n - 1; i++) {
            if (idx == 0) {
                ans += k - a[n - 1] + a[idx];
                idx = n - 1;
            } else {
                ans += a[idx] - a[idx - 1];
                idx--;
            }
        }
        System.out.println(ans);
    }
}
