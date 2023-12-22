import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < a.length; i++) {
            a[i] = scanner.nextInt();
        }
        int ans = 0;
        for (int i = 0; i < n - 2; i++) {
            int[] b = new int[]{a[i], a[i+1], a[i+2]};
            Arrays.sort(b);
            if (b[1] == a[i+1]) {
                ans++;
            }
        }
        System.out.println(ans);
    }
}
