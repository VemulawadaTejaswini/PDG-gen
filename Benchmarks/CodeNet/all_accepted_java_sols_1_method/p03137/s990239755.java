import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] x = new int[m];
        if (n >= m) {
            System.out.println(0);
            return;
        }
        for (int i = 0 ; i < m ; i++ ) {
            x[i] = sc.nextInt();
        }
        Arrays.sort(x);
        int[] div = new int[m - 1];
        for (int i = 0 ; i < m - 1 ; i++) {
            div[i] = x[i + 1] - x[i];
        }
        Arrays.sort(div);
        int ans = x[m - 1] - x[0];
        for (int i = 0 ; i < n - 1 ; i++) {
            ans -= div[m- 2 - i];
        }
        System.out.println(ans);

    }

}