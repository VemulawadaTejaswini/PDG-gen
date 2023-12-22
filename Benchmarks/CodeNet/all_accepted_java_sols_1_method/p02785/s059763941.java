import java.util.*;
public class Main{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
      int n =sc.nextInt();
      long k = sc.nextLong();
      Long arr[] = new Long[n];
      for(int i=0;i<n;i++){
        arr[i]  = sc.nextLong();
      }
      Arrays.sort(arr);long sum =0;
      for(int i=0;i<(n-k);i++){
          sum += arr[i];
      }
      System.out.println(sum);
  }
}
