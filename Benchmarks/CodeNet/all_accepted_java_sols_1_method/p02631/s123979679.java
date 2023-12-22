import java.util.*;
public class Main {
 
  public static void main(String[] args) { 
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int[] arr = new int[n];
      int xor = 0;
      for(int i = 0; i < n; i++) {
        arr[i] = sc.nextInt();
        xor ^= arr[i];
      }
      StringBuilder sb = new StringBuilder();
      for(int i = 0; i < n; i++) {
        if(i == n - 1)
          sb.append(xor ^ arr[i]);
        else
          sb.append((xor ^ arr[i]) + " ");
      }
      System.out.println(sb.toString());
  }
}