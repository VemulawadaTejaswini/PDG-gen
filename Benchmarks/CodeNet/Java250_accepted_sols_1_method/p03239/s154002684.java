import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        int t = Integer.parseInt(sc.next());
        int[] cost = new int[n];
        int[] time = new int[n];
        for (int i = 0; i < n; i++) {
            cost[i] = Integer.parseInt(sc.next());
            time[i] = Integer.parseInt(sc.next());
        }
        int ans = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            if (time[i] <= t) {
                if (cost[i] < ans) {
                    ans = cost[i];
                }
            }
        }
        if (ans == Integer.MAX_VALUE) {
            System.out.println("TLE");
        } else {
            System.out.println(ans);
        }
    }
}
