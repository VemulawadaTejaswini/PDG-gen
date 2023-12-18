import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

      String s = sc.next();
      String t = sc.next();
      
      if (1<=s.length() && s.length()<= 10) {
        if (t.length() == s.length() + 1) {
          System.out.println("Yes");
        } else {
          		System.out.println("No");
        }
      } else {
		System.out.println("No");
      }

	}
}
