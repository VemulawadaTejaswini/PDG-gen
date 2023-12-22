import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] heights = new int[N];
        for (int i = 0; i < N; i++) {
            heights[i] = sc.nextInt();
        }

        int[] cost = new int[N];
        cost[0] = 0;
        cost[1] = Math.abs(heights[1] - heights[0]);
        for (int i = 2; i < N; i++) {
            cost[i] = Math.min(cost[i - 1] + Math.abs(heights[i] - heights[i - 1]), cost[i - 2] + Math.abs(heights[i - 2] - heights[i]));
        }

        System.out.println(cost[N - 1]);
    }
}