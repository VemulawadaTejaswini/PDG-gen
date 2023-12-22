import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        
        while (input.hasNext()) {
            int N = input.nextInt();
            int[] h = new int[N];
            
            for (int i = 0; i < h.length; ++i) {
                h[i] = input.nextInt();
            }
            
            int[] cost = new int[h.length];
            cost[0] = 0;
            cost[1] = Math.abs(h[1] - h[0]);
            
            for (int i = 2 ; i < h.length; ++i) {
                cost[i] = Math.min(cost[i - 1] + Math.abs(h[i] - h[i - 1]), cost[i - 2] + Math.abs(h[i] - h[i - 2]));
            }
            
            System.out.println(cost[cost.length - 1]);
        }
    }
}
