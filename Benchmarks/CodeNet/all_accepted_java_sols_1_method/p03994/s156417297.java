import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		int k = sc.nextInt();

		for (int i = 0; i < s.length(); i++) {
			int c = (int)(s.charAt(i) - 'a');
			if (i == s.length() - 1) {
				c = (c + k) % 26;
			} else if (c != 0 && 26 - c <= k) {
				k -= 26 - c;
				c = 0;
			}
			System.out.printf("%c", (char)c + 'a');
		}
		System.out.println();
	}
}
