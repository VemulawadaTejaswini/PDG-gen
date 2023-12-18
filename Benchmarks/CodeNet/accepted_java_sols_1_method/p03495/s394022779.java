import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int num[] = new int[n];
        Arrays.fill(num, 0);
        for (int i = 0; i < n; i++) {
            int a = in.nextInt() - 1;
            num[a]++;
        }
        Arrays.sort(num);
        int m = -1;
        int ans = 0;
        for (int i = 0; i < n; i++) {
            if (num[i] == 0) {
                continue;
            }
            
            if (m == -1) {
                m = n - i;
            }

            if (m <= k) {
                break;
            }

            if (m > k) {
                ans += num[i];
                m--;
            }
        }

        System.out.println(ans);
    }
}