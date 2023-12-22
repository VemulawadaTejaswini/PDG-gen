import java.util.Arrays;
import java.util.Scanner;

public class Main {
  public static void main (String[] args) {
    Scanner input = new Scanner(System.in);
    
    while (input.hasNext()) {
      int N = input.nextInt();
      int K = input.nextInt();
      int[] h = new int[N];
      
      for (int i = 0; i < h.length; ++i) {
        h[i] = input.nextInt();
      }
      
      int[] cost = new int[N];
      Arrays.fill(cost, Integer.MAX_VALUE);
      cost[0] = 0;
      for (int i = 0; i < h.length; ++i) {
        final int END = Math.min(h.length, i + K + 1);
        
        for (int j = i + 1; j < END; ++j) {
          cost[j] = Math.min(cost[j], cost[i] + Math.abs(h[j] - h[i]));
        }
      }
      
      System.out.println(cost[cost.length - 1]);
    }
  }
}