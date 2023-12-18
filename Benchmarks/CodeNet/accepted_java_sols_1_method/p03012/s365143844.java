import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
    int ans = 0;
    int[] w = new int[n];
    int[] sum = new int[n];

    for(int i = 0; i < n; i++){
      w[i] = sc.nextInt();
      if(i == 0){
        sum[i] = w[i];
      } else {
        sum[i] = sum[i - 1] + w[i];
      }
    }

    for(int i = 0; i < n - 1; i++){
      if((sum[i] <= sum[n - 1] - sum[i]) && (sum[i + 1] >= sum[n - 1] - sum[i + 1])){
        ans = Math.min(sum[n - 1] - 2 * sum[i], 2 * sum[i + 1] - sum[n - 1]);
        break;
      }
    }

    System.out.println(ans);
  }
}
