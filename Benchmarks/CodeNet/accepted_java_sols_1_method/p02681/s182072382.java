import java.util.*;
 
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String S = sc.next();
		String T = sc.next();
		String s = S.substring(0, S.length());
		String t = T.substring(0, S.length());
		if(s.equals(t))
		System.out.println("Yes");
		else
		System.out.println("No");
	}
}