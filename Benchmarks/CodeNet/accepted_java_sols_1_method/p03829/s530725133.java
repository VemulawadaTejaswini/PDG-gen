import java.util.*;
public class Main {

  public static void main(String[] args) { 
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int a = sc.nextInt();
      int b = sc.nextInt();

      int[] arr = new int[n];
      for(int i = 0; i < n; i++)
        arr[i] = sc.nextInt();

      long cost = 0;
      for(int i = 1; i < n; i++){
        int prevX = arr[i - 1];
        int curX = arr[i];
        cost += Math.min((long)(curX - prevX) * a, b);
      }
      System.out.println(cost);
  }
}