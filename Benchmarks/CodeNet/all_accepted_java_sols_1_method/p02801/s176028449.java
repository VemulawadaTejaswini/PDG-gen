import java.util.*;
public class Main{
   public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
      String  n = sc.next();
      char[] ans = n.toCharArray();
      ans[0]++;
     System.out.println(ans[0]);
   }
}
