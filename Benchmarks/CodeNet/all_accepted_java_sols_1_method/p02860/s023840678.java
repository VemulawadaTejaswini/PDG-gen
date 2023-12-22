import java.util.*;
 
public class Main {
	public static void main (String[] args){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		String S = sc.next();
		char[] s = S.toCharArray();
		boolean A = true;
		if(N%2 != 0) {
			A = false;
		}
		for(int i = 0; i < N/2; i++) {
			if(s[i] != s[(N/2)+i]) {
				A = false;
				break;
			}
		}
		if(A == true) {
			System.out.println("Yes");
		}
		else {
			System.out.println("No");
		}
	}
}