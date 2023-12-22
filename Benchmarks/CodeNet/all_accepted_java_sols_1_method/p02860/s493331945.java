import java.util.*;
import java.lang.*;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		String S = sc.next();
		String ss = S.substring(0,N/2);
		String sss = S.substring(N/2);
		String ans = "A";
		if( ss.equals(sss) ){
			ans = "Yes";
		}else{
			ans = "No";
		}
		if( N%2!=0 ){
			ans = "No";
		}
		System.out.println(ans);
	}
}
