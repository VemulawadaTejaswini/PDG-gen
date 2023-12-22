import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String S = sc.next();
		String T = sc.next();
		
		int N = T.length();
		
		String ans = "No";
		

		for (int i = 0; i < N; i++) {
			String S1 = S.substring(0, i);
			String S2 = S.substring(i, N);
			
			if( T.equals( S2+S1 ) ){
				ans = "Yes"; 
				break;
			}
		}
		System.out.println(ans);
	}
}