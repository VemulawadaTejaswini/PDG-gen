import java.util.*;
public class Main {

  public static void main(String[] args) { 
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();

      long[] arr = new long[n];
      for(int i = 0; i < n; i++)
        arr[i] = sc.nextInt();

      Arrays.sort(arr);
      long[] prefixSum = new long[n];
      prefixSum[0] = arr[0];
      for(int i = 1; i < n; i++) {
        prefixSum[i] = prefixSum[i-1] + arr[i];
      }
      int i = n - 2;
      while(i >= 0) {
        if(prefixSum[i] * 2 < arr[i + 1])
          break;
        i--;
      }

      System.out.println(n - 1 - i);
  }
}