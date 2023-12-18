import java.util.*;
public class Main {
	public static void main(String[] args) {
		new Main().run();
	}
	void run() {
		Scanner sc = new Scanner(System.in);
		
		char digit[] = {'0', '1', '2', '3', '5', '7', '8', '9'};
		for(;;) {
			int N = sc.nextInt();
			if( N == 0 ) break;
			
			StringBuilder sb = new StringBuilder();
			while( N > 0 ) {
				sb.append( digit[ N % 8] );
				N /= 8;
			}
			sb.reverse();
			System.out.println( sb.toString());
		}
	}
}