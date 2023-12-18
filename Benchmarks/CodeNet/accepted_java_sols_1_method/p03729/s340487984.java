import java.util.*;
public class Main{
  public static void main(String[]args){
      Scanner sc = new Scanner(System.in);

      String a = sc.next();
      String b = sc.next();
      String c = sc.next();
      char a1 = a.charAt(a.length()-1);
      char b1 = b.charAt(0);
      char b2 = b.charAt(b.length()-1);
      char c1 = c.charAt(0);

      if (a1==b1&&b2==c1) {
        System.out.println("YES");
      }else{
        System.out.println("NO");
      }
}
}
