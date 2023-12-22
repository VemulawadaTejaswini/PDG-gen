import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int t = sc.nextInt();
        int[] cost = new int[n];
        int[] time = new int[n];
        int min = 1001;
        for (int i = 0; i < n; i++) {
            cost[i] = sc.nextInt();
            time[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            if (time[i] <= t) {
                if (min > cost[i])
                    min = cost[i];
            }
        }
        if (min != 1001)
            System.out.println(min);
        else
            System.out.println("TLE");
    }
}