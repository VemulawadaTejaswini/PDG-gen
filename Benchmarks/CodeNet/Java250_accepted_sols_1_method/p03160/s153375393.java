import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] stones = new int[N];
        for (int i = 0; i < N; i++) {
            stones[i] = sc.nextInt();
        }
        int[] cost = new int[N];
        cost[0] = 0;
        cost[1] = Math.abs(stones[1] - stones[0]);
        for (int i = 2; i < N; i++) {
            int cost1 = Math.abs(stones[i] - stones[i-1]) + cost[i-1];
            int cost2 = Math.abs(stones[i] - stones[i-2]) + cost[i-2];
            cost[i] = Math.min(cost1, cost2);
        }
        System.out.println(cost[N-1]);
    }
}