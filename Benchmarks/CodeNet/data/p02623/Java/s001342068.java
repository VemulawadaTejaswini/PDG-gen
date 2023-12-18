import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int k = scanner.nextInt();
        int[] da = new int[n];
        int[] db = new int[m];
        for (int i = 0; i < n; i++) {
            da[i] = scanner.nextInt();
        }
        for (int i = 0; i < m; i++) {
            db[i] = scanner.nextInt();
        }
        long sa = 0;
        int ans = 0;
        for (int i = 0; i < n; i++) {
            sa += da[i];
            if (sa > k) break;
            long sb = 0;
            for (int j = 0; j < m; j++) {
                sb += db[j];
                if (sb + sa > k) {
                    break;
                } else {
                    ans = Math.max(i + j + 2, ans);
                }
            }
        }
        System.out.println(ans);
    }
}