
import java.util.Scanner;

public class Main {
    public static void main(String [] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int max;
        int [] h = new int[n];
        for (int i = 0; i < n; ++i) {
            h[i] = scanner.nextInt();
        }
        max = h[0];
        int ans = 1;
        for (int i = 1; i < n; ++i) {
            if (max <= h[i]) {
                ++ans;
            }
            max = Math.max(max, h[i]);
        }
        System.out.println(ans);
    }
}
