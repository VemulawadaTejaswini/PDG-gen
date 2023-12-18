import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] x = new int[m + 1];
        int[] y = new int[m + 1];
        for (int i = 1; i <= m; i++) {
            x[i] = sc.nextInt();
            y[i] = sc.nextInt();
        }

        boolean[] red = new boolean[n + 1];
        int[] nums = new int[n + 1];
        red[1] = true;
        for (int i = 1; i <= n; i++) {
            nums[i] = 1;
        }
        for (int i = 1; i <= m; i++) {
            if (red[x[i]]) {
                if (nums[x[i]] <= 1) {
                    red[x[i]] = false;
                }
                red[y[i]] = true;
            }
            nums[x[i]]--;
            nums[y[i]]++;
        }
        int ans = 0;
        for (int i = 1; i <= n; i++) {
            if (red[i]) {
                ans++;
            }
        }
        System.out.println(ans);
    }

}
