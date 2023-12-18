import java.util.*;
public class Main{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		String S = sc.next();
		String T = sc.next();
		String ans = "No";
		int len = T.length();
		if(T.substring(0,len - 1).equals(S)){
			ans = "Yes";
		}
		System.out.println(ans);
	}
}