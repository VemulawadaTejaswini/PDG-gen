import java.util.*;
public class Main {
	public static void main(String[] args){
      Scanner sc = new Scanner(System.in);

      String s = sc.next();
      String t = sc.next();
      int sleng = s.length();
      String tcut = t.substring(0, sleng);
      if (s.equals(tcut)) {
        System.out.println("Yes");
      } else {
        System.out.println("No");
      }

	}
}