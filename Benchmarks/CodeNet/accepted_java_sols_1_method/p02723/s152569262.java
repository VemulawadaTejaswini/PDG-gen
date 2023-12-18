import java.util.*;
public class Main{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		String S = sc.next();
		String ans = "No";
		if(S.charAt(2) == S.charAt(3) && S.charAt(4) == S.charAt(5)){
			ans = "Yes";
		}
		System.out.println(ans);
	}	
}