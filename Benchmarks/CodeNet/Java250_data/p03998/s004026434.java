import java.util.Scanner;

public class Main {
	static int ans;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String S1 = sc.next();
		String S2 = sc.next();
		String S3 = sc.next();
		sc.close();
		char c = S1.charAt(0);
		solve(S1.substring(1, S1.length()), S2, S3, c);
		if(ans == 1) System.out.println("A");
		else if(ans == 2) System.out.println("B");
		else System.out.println("C");
	}
	static void solve(String S1, String S2, String S3, char n) {
		//System.out.println(S1 + " " + S2 + " " + S3 + " " + n);
		if(n == 'a') {
			if(S1.length() == 0) {ans = 1; return;}
			char c = S1.charAt(0);
			solve(S1.substring(1, S1.length()), S2, S3, c);
		}else if(n == 'b') {
			if(S2.length() == 0) {ans = 2; return;}
			char c = S2.charAt(0);
			solve(S1, S2.substring(1, S2.length()), S3, c);
		}else if(n == 'c') {
			if(S3.length() == 0) {ans = 3; return;}
			char c = S3.charAt(0);
			solve(S1, S2, S3.substring(1, S3.length()), c);
		}

	}
}