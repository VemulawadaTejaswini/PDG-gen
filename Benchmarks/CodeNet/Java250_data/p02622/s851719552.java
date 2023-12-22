import java.util.*;
public class Main{
	public static void main(String args[]){

		Scanner ob = new Scanner(System.in);
		String S = ob.next();
		String T = ob.next();
		int C = 0;

		for (int i = 0; i < S.length(); i++) {
			
			if(S.charAt(i) != T.charAt(i) ){
				C++;
			}
		}
		System.out.println(C);
	}
}