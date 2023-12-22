import java.util.*;
public class Main {
	public static void main (String[] args) {
      Scanner sc = new Scanner(System.in);
      String A = sc.next(), B = sc.next();
      String AB = A+B;
      int num = Integer.valueOf(AB);
      int sqrt = (int)Math.pow(num,0.5);
      String ans = (sqrt*sqrt == num)?"Yes" : "No";
      System.out.println(ans);
      
    }
}