import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		
		String s = sc.next();
		int c=0;
		int m=0;
		for( char ch : s.toCharArray()) {
			if( 'R' == ch ) {
				c++;
			}else {
				c=0;
			}
			m = Math.max(m, c);
		}
		System.out.println(m);
	}
}
