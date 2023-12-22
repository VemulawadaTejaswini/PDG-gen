import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int N = sc.nextInt();
		String S = sc.next();
		int left = 0, right = 0;
		for(int i = 0; i < S.length(); i++){
			if(S.charAt(i) == '.') right++;
		}
		int ans = left + right;
		for(int i = 0; i < N; i++) {
			if(S.charAt(i) == '#') left++;
			else right--;
			ans = Math.min(ans, left + right);
		}
		System.out.println(ans);
	}
}