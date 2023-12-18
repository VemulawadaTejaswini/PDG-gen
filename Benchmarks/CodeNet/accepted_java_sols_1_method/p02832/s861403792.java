import java.util.*;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int ans = 0;
        int nowIndex = 1;

        for (int i = 1; i <= n; i++) {
            if (sc.nextInt() == nowIndex) {
                nowIndex++;
            } else {
                ans++;
            }
        }
        if (ans == n) {
            ans = -1;
        }

        System.out.println(ans);
    }
}