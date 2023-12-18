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
        int pb = 0;
        long sb = 0;
        for (; pb < m; pb++) {
            sb += db[pb];
            if (sb > k) break;
        }
        pb--;
        if (sb > k) {
            sb -= db[pb + 1];
        }
        long sa = 0;
        int ans = 0;
        for (int i = 0; i < n; i++) {
            sa += da[i];
            if (sa > k) break;
            while (pb >= 0 && sa + sb > k) {
                sb -= db[pb--];
            }
//            System.out.println(i + " " + pb);
            ans = Math.max(i + 1 + pb + 1, ans);
        }
        System.out.println(ans);
    }
}