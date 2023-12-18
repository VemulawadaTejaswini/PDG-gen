import java.util.*;

public class Main{
	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);
		String S = sc.next();
		String T = sc.next();
		boolean flag = S.equals(T.substring(0,T.length() - 1)) && S.length() == T.length() - 1;
		System.out.println(flag?"Yes":"No");
		sc.close();
	}
}