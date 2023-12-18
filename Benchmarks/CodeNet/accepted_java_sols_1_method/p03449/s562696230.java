import java.util.*;
public class Main {

  public static void main(String[] args) { 
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();

      int[] up = new int[n];
      up[0] = sc.nextInt();
      for(int i = 1; i < n; i++)
        up[i] = up[i-1] + sc.nextInt();

      int[] down = new int[n];
      for(int i = 0; i < n; i++)
        down[i] = sc.nextInt();
      for(int i = n - 2; i >= 0; i--)
        down[i] += down[i+1];

      int max = 0;
      for(int i = 0; i < n; i++)
        max = Math.max(max, up[i] + down[i]);
      System.out.println(max);
  }
}