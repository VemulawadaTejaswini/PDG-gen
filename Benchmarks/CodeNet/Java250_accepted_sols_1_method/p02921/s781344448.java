import java.util.*;

public class Main{
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		String S = sc.next();
		String T = sc.next();
		
		int result = 3;
		
		for(int i = 0; i < 3; i++) {
			if(S.charAt(i) != T.charAt(i))result--;
		}
		System.out.println(result);
	}
}