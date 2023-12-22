import java.util.*;
public class Main {

  public static void main(String[] args) { 
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int k = sc.nextInt();
      int[] arr = new int[n];
      for(int i = 0; i < n; i++)
        arr[i] = sc.nextInt();

      Arrays.sort(arr);
      int minHeigth = Integer.MAX_VALUE;
      for(int i = k - 1; i < arr.length; i++) {
        minHeigth = Math.min(minHeigth, arr[i] - arr[i - k + 1]);
      }
      System.out.println(minHeigth);
  }
}