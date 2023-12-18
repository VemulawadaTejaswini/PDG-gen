import java.util.*;
public class Main {
 
  public static void main(String[] args) { 
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int[] arr = new int[n + 1];
      Arrays.fill(arr, 2);
      arr[1]--;
      for(int i = 2; i * 2 <= n; i++) {
        for(int j = i * 2; j <= n; j += i)
          arr[j]++;
      }
      long sum = 0;

      for(int i = 1; i <= n; i++)
        sum += ((long)arr[i] * i);
      System.out.println(sum);
  }
}