import java.util.*;
import java.io.*;
import static java.lang.System.*;
import static java.lang.Math.*;

class Item {
  int value;
  int weight;
}

public class Main {
	static int[][] dp;
	static int[] p;

	public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int w = sc.nextInt();

    Item[] item = new Item[n+1];
    int[][] dp = new int[n+1][w+1];

    for (int i = 1; i <= n; i++) {
      item[i] = new Item();
      item[i].value = sc.nextInt();
      item[i].weight = sc.nextInt();
    }
    sc.close();

    for (int i = 1; i <= n; i++) {
      for (int j = 1; j <= w; j++) {
        dp[i][j] = dp[i-1][j];
        if(j-item[i].weight >= 0){
          dp[i][j] = max(dp[i][j], dp[i-1][j-item[i].weight] + item[i].value);
        }
      }
    }

    out.println(dp[n][w]);
	}

}
