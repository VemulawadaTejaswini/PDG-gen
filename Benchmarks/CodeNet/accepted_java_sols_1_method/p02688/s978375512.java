import java.util.Scanner;

public class Main {

    static long ans = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        int k = Integer.parseInt(sc.next());
        int[] a = new int[n];
        for (int i = 0; i < k; i++) {
            int d = Integer.parseInt(sc.next());
            for (int j = 0; j < d; j++) {
                a[Integer.parseInt(sc.next()) - 1]++;
            }
        }
        int ans = 0;
        for (int i = 0; i < n; i++) {
            if (a[i] == 0) {
                ans++;
            }
        }
        System.out.println(ans);
    }
}