import java.util.*;
public class Main {

  public static void main(String[] args) { 
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int[][] arr = new int[n][2];
      long sum = 0;
      for(int i = 0; i < n; i++) {
        arr[i][0] = sc.nextInt();
        arr[i][1] = sc.nextInt();
        sum += arr[i][1];
      }

      Arrays.sort(arr, (a, b) -> b[0] + b[1] - a[0] - a[1]);
      for(int i = 0; i < n; i+=2)
        sum -= (arr[i][0] + arr[i][1]);

      System.out.println(-sum);
  }
}