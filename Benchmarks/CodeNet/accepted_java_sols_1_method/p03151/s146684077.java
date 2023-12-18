import java.util.*;
public class Main {

  public static void main(String[] args) { 
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int[][] arr = new int[n][2];

      long sumA = 0;
      for(int i = 0; i < n; i++) {
        arr[i][0] = sc.nextInt();
        sumA += arr[i][0];
      }

      long sumB = 0;
      for(int i = 0; i < n; i++) {
        arr[i][1] = sc.nextInt();
        sumB += arr[i][1];
      }

      if(sumA < sumB) {
        System.out.println(-1);
        return;
      }

      Arrays.sort(arr, (a1, a2) -> (a1[0] - a1[1]) - (a2[0] - a2[1]));
      int cnt = 0;
      long diffSum = 0;
      for(int i = 0; i < n; i++) {
        if(arr[i][0] >= arr[i][1]) break;
        cnt++;
        diffSum += arr[i][1] - arr[i][0];
      }

      for(int i = n - 1; i >= 0 && diffSum > 0; i--) {
        diffSum -= (arr[i][0] - arr[i][1]);
        cnt++;
      }
      System.out.println(cnt);
  }
}
