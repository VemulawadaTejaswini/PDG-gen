import java.util.Scanner;
public class Main {
	
	
	public static void main(String args[] ) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		
		Long sum = Long.valueOf(s);
		for( int i = 1; i < (1<<(s.length()-1)); i++ ) {
			String str = String.valueOf(s.charAt(0));
			for( int j = 0; j < s.length(); j++ ) {
				if( j == s.length()-1) {
					sum += Integer.valueOf(str);
				}
				else if((1 & i>>j) == 1) {
					sum += Integer.valueOf(str);
					str = String.valueOf(s.charAt(j+1));
				}
				else {
					str += s.charAt(j+1);
				}
			}
		}
		System.out.println( sum );
		
		
		sc.close();
	}
}