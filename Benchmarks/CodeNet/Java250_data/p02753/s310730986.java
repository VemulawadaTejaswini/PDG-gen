import java.util.*;
public class Main{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		char[] S = new char[3];
		String SS = sc.next();
		String ans = "Yes";
		for(int i = 0;i < 3;i++){
			S = SS.toCharArray();
		}
		if(S[0] == S[1] && S[1] == S[2]){
			ans = "No";
		}
		System.out.println(ans);
	}
}