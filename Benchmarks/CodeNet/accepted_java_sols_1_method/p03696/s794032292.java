import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		String S = sc.next(); String ans = S.concat("");

		int left = 0, right = 0;

		// left
		for(int i = 0; i < N; i++) {
			if(S.charAt(i) == '(') left++;
			else if(left > 0) left--;
		}
		// ans + ')' * left
		while(left > 0) {
			ans += ")";
			left--;
		}

		//right
		for(int i = N - 1; i >= 0; i--) {
			if(S.charAt(i) == ')') right++;
			else if(right > 0) right--;
		}
		// '(' * right + ans
		while(right > 0) {
			ans = "(" + ans;
			right--;
		}
		System.out.println(ans);
	}
}
