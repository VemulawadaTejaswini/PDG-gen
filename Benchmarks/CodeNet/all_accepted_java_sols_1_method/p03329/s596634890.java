import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    ArrayList<Integer> kingaku = new ArrayList<Integer>();
    kingaku.add(1);
    for(int i = 1; i < 100; i++) {
      int a = (int)Math.pow(6, i);
      if(a > 100000) break;
      kingaku.add(a);
    }
    for(int i = 1; i < 100; i++) {
      int b = (int)Math.pow(9, i);
      if(b > 100000) break;
      kingaku.add(b);
    }
    Collections.sort(kingaku);
    int[] dp = new int[n + 1];
    dp[1] = 1;
    for(int i = 2; i <= n; i++) {
      int t = i;
      for(int j = 0; j <= kingaku.size() - 1; j++) {
        if(i >= kingaku.get(j)) t = Math.min(t, dp[i - kingaku.get(j)] + 1);
      }
      dp[i] = t;
    }
    System.out.println(dp[n]);
  }
}