import java.util.*;

public class Main {

   public static void main(String[] args) {

      Scanner sc = new Scanner(System.in);
      int l = sc.nextInt();
      int r = sc.nextInt();
      int d = sc.nextInt();
      int ans = r/d - (l-1) / d;

      System.out.println(ans);

   }  
}
