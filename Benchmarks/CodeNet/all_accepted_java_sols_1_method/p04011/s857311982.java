import java.util.*;
public class Main{
  public static void main(String[]args){
      Scanner sc = new Scanner(System.in);

      int n = sc.nextInt();
      int k = sc.nextInt();
      int x = sc.nextInt();
      int y = sc.nextInt();
      int sum=0;

      if (n<=k) {
        for (int i = 0;i<n ;i++ ) {
          sum = sum + x;
        }
        System.out.println(sum);
        System.exit(0);
      }

      for (int i = 0;i<k ;i++ ) {
        sum = sum + x;
      }
      for (int i = k;i<n ;i++ ) {
        sum = sum + y;
      }
      System.out.println(sum);

  }
}
