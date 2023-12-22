import java.util.Scanner;

//AtCoder Beginner Contest 159
//B	String Palindrome
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String S = sc.next();
		sc.close();

		for (int i = 0; i < S.length()/2; i++) {
			if (S.charAt(i) != S.charAt(S.length()-1-i)) {
				System.out.println("No");
				return;
			}
		}
		for (int i = 0; i < S.length()/2; i++) {
			if (S.charAt(i) != S.charAt((S.length()/2-1)-i)) {
				System.out.println("No");
				return;
			}
			if (S.charAt(S.length()/2+1+i) != S.charAt(S.length()-1-i)) {
				System.out.println("No");
				return;
			}
		}

		System.out.println("Yes");
	}
}
