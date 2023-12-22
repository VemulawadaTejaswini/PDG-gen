import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	    String S = sc.next().replaceAll("\\?", ".");
	    String T = sc.next();
	    for (int i = S.length() - T.length(); i >= 0; i--) {
	      String s = S.substring(i, i + T.length());
	      if (T.matches(s)) {
	        S = S.replaceFirst(S.substring(0, i) + s, S.substring(0, i) + T).replaceAll("\\.", "a");
	        System.out.println(S);
	        return;
	      }
	    }
	    System.out.println("UNRESTORABLE");
	}
}
