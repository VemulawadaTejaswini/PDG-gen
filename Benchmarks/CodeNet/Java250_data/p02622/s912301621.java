import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		try (final Scanner sc = new Scanner(System.in);) {
			final char[] s = sc.next().toCharArray();
			final char[] t = sc.next().toCharArray();

			int c=0;
			for(int i=0; i< s.length; i++) {
				if(s[i]!=t[i]) {
					c++;
				}
			}
			System.out.println(c);
		}
	}
}