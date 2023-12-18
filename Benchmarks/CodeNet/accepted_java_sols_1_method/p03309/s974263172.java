import java.util.*;
public class Main {

  public static void main(String[] args) { 
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int[] arr = new int[n];
      for(int i = 0; i < n; i++) {
        arr[i] = sc.nextInt() - i - 1;
      }
      Arrays.sort(arr);
      int b = arr[(arr.length - 1) / 2];
      long sum = 0;
      for(int num : arr)
        sum += Math.abs(num - b);
      
      System.out.println(sum);
  }

}
