import java.util.*;
public class Main {

  public static void main(String[] args) { 
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int m = sc.nextInt();
      int sum  = 0;
      int[] arr = new int[n];
      for(int i = 0; i < n; i++) {
        arr[i] = sc.nextInt();
        sum += arr[i];
      }
      int cnt = 0;
      for(int i = 0; i < n; i++) {
        if(arr[i] >= sum * 1.0 / (4 * m))
          cnt++;
      }
      System.out.println(cnt >= m ? "Yes" : "No");
  }
}