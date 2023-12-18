import java.util.*;
public class Main{
  public static void main(String[]args){
      Scanner sc = new Scanner(System.in);

      int n = sc.nextInt();
      int x = sc.nextInt();
      int[] data = new int[n];
      int sum = 0;
      int count = 1;

      for (int i = 0;i<n ;i++ ) {
        data[i] = sc.nextInt();
      }

      for (int i = 0;i<n ;i++ ) {
          sum = sum + data[i];
          if (sum<=x) {
              count++;
          }
      }
      System.out.println(count);
}
}
