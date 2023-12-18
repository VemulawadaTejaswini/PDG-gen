import java.util.Scanner;

public class Main {
	private Scanner sc;
	private void run() {
		sc = new Scanner( System.in );
		int n = sc.nextInt();
		sc.nextLine();  // pass '\n'
		for( int i = 0; i < n; i++ ) {
			String line = sc.nextLine();
			System.out.println( line.replace( "Hoshino", "Hoshina" ) );
		}
	}
	
	
	public static void main( String[] args ) {
		new Main().run();
	}
}