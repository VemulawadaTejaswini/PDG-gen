import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
	    int n = Integer.parseInt(sc.next());
        int[][] val_cost = new int[2][n];
        
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < n; j++) {
                val_cost[i][j] = Integer.parseInt(sc.next());
            }
        }
        int val_sum = 0;
        int cost_sum = 0;
        for (int i = 0; i < n; i++) {
            int val = val_cost[0][i];
            int cost = val_cost[1][i];
            if (val > cost) {
                val_sum += val;
                cost_sum += cost;
            }
        }
        System.out.println(val_sum - cost_sum);
    }
}
