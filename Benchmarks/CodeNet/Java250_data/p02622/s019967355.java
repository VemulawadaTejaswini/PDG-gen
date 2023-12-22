import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String s = scan.next();
		String t = scan.next();
		char[] S = s.toCharArray();
		char[] T = t.toCharArray();
		int count = 0;

		for(int i = 0;i < s.length();i++) {
			if(S[i] != T[i]) {
				count += 1;
			}
		}

		System.out.println(count);
	}
}
