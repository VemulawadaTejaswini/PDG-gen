
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        final Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int n = in.nextInt();
        int[] cost = new int[n];
        int[] h = new int[n];
        for (int i = 0; i < n; i++) {
            h[i] = in.nextInt();
        }

        cost[1] = Math.abs(h[1] - h[0]);
        for (int i = 2; i < n; i++) {
            cost[i] = Math.min(cost[i - 2] + Math.abs(h[i] - h[i - 2]), cost[i - 1] + Math.abs(h[i] - h[i - 1]));
        }
        System.out.println(cost[n-1]);
    }
}
