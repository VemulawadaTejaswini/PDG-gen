import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int M = sc.nextInt();

    List<int[]> keys = new ArrayList<>();
    for (long i = 0; i < M ; i++) {
      int cost = sc.nextInt();
      int b = sc.nextInt();
      int key = 0;
      for (int j = 0; j < b; j++) {
        int box = sc.nextInt() -1;
        key |= (1<<box);
      }
      int[] pair = {key, cost};
      keys.add(pair);
    }

    int[] dp = new int[1<<N];
    int MAX = 1001001001;
    Arrays.fill(dp,MAX);
    dp[0] = 0;//cost
    for (int i = 0; i < (1<<N) ; i++) {
      if( dp[i] >= MAX) continue;
      for (int[] pair: keys) {
        int cost = pair[1];
        int key = pair[0];
        int newState = i | key;
        int newCost = dp[i] + cost;
        if(dp[newState] > newCost){
          dp[newState] = newCost;
        }
      }
    }
    if(dp[(1<<N)-1] >= MAX){
      System.out.println(-1);
    }else{
      System.out.println(dp[(1<<N)-1] );
    }

  }
}