import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		long n = java.lang.Long.parseLong(sc.next());
		sc.close();
		String ans = "";

		while( n > 0) {
			n -= 1;
			ans += (char)('a' + n % 26);
			n /= 26;
		}
		
		for(int i = 0; i < ans.length(); i++) {
			System.out.print(ans.charAt(ans.length() - 1 - i));
		}
		System.out.println();
	}
}