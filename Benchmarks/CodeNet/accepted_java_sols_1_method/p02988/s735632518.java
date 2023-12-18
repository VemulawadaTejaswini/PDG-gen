import java.util.*;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] list = new int[n];
        for (int i = 0; i < n; i++) {
            list[i] = sc.nextInt();
        }

        int ans = 0;
        for (int i = 1; i < n - 1; i++) {
            if (list[i - 1] > list[i] && list[i] > list[i + 1]) {
                ans++;
            }
            if (list[i - 1] < list[i] && list[i] < list[i + 1]) {
                ans++;
            }
        }

        System.out.println(ans);
    }
}