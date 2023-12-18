import java.util.*;
import java.lang.*;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		String S = String.valueOf(N);
		char a = S.charAt(0);
		char b = S.charAt(1);
		char c = S.charAt(2);
		if( a=='7' || b=='7' || c=='7' ){
			System.out.println("Yes");
		}else{
			System.out.println("No");
		}
	}
}