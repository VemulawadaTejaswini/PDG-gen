import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n + 1];
        int[] b = new int[n];
        long counter = 0;
        for (int i = 0; i < n + 1; i++) {
            a[i] = sc.nextInt();
            counter += a[i];
        }
        for (int i = 0; i < n; i++) {
            b[i] = sc.nextInt();
        }
        sc.close();

        // 倒す処理
        for (int i = 0; i < n; i++) {
            if (a[i] >= b[i]) {
                a[i] -= b[i];
            } else {
                a[i + 1] = Math.max(0, a[i + 1] - (b[i] - a[i]));
                a[i] = 0;
            }
        }

        // 回答
        long ans = counter;
        for (int i = 0; i < n + 1; i++) {
            ans -= a[i];
        }
        System.out.println(ans);
    }

}
