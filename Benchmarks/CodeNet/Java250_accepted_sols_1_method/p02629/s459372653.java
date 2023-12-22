
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();
		StringBuilder sb = new StringBuilder();

		while(n > 0) {
			n--;
			sb.append((char)( 'a' + n % 26 ) );  // sb.append((char)( 97 + n % 26 ) );
			n = n / 26;
			//System.out.println(sb);
		}

		System.out.println(sb.reverse());

		sc.close();


	}
}