import java.util.*;
public class Main {

  public static void main(String[] args) { 
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int l = sc.nextInt();
      int[] arr = new int[n];
      int sum = 0;
      for(int i = 0; i < n; i++) {
        arr[i] = l + i;
        sum += arr[i];
      }
      int min = Integer.MAX_VALUE;
      int res = 0;
      for(int i = 0; i < n; i++) {
        if(Math.abs(arr[i]) < min) {
          min = Math.abs(arr[i]);
          res = sum - arr[i];
        }
      }
      System.out.println(res);
  }
}