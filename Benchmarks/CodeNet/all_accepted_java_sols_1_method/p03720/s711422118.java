import java.util.*;

public class Main {
    public static void main(final String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] r = new int[n+1];
        for (int i = 0; i < m; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            r[a]++;
            r[b]++;
        }

        for (int i = 1; i <= n; i++) {
            System.out.println(r[i]);
        }
    }
}