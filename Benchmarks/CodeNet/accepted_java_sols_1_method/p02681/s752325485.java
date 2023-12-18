import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner in=new Scanner (System.in);
		String S=in.next();
		String T=in.next();
		String X=T.substring(0, T.length()-1);
		if(S.equals(X)) {
			System.out.println("Yes");
		}
		else {
			System.out.println("No");
		}
	}
}