import java.util.*;
import java.lang.*;
import java.math.*;

public class Main {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] height = new int[n];
        int[] cost = new int[n];
        for (int i = 0; i < n; i++) {
            height[i] = sc.nextInt();
        }
        cost[0] = 0;
        for (int i = 1; i < n; i++) {
            if (i == 1) {
                cost[i] = Math.abs(height[i]-height[i-1]);
            } else {
                cost[i] = Integer.MAX_VALUE;           
                for (int j = 1; j <= k; j++) {
                    if (i - j >= 0) {
                        int tmp = cost[i-j] + Math.abs(height[i]-height[i-j]);
                        if (tmp < cost[i]) {
                            cost[i] = tmp;
                        }
                    }
                }
            }
        }
        System.out.println(cost[n-1]);
        sc.close();
    }
}
