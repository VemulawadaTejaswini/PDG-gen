import java.util.*;
import java.lang.*;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		String S = sc.next();
		int N = S.length();
		String T = sc.next();
		String TT = T.substring(0,N);
		if( S.equals(TT) ){
			System.out.println("Yes");
		}else{
			System.out.println("No");
		}
	}
}