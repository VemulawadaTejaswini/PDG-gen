import java.util.*;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[]$) {
        int n = scanner.nextInt();
        int[] t = new int[n];
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += t[i] = scanner.nextInt();
        }
        int m = scanner.nextInt();
        for (int i = 0; i < m; i++) {
            int p = scanner.nextInt() - 1;
            int x = scanner.nextInt();
            System.out.println(sum - t[p] + x);
        }
    }
}