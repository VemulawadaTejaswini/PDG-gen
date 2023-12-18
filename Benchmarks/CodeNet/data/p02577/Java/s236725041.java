
import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		
		int s = 0;
		String n = sc.next();
		for( char ch : n.toCharArray()) {
			s += ch - '0';
			s %= 9;
		}
		
		if( s == 0) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
	}
}