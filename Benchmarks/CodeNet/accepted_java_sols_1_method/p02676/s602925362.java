import java.util.*;
import java.lang.*;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		int K = sc.nextInt();
		String S = sc.next();
		int N = S.length();
		if( N<=K ){
			System.out.println(S);
		}else{
			System.out.println(S.substring(0,K)+"...");
		}
	}
}