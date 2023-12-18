import java.util.*;


public class Main {

	static Scanner sc = new Scanner( System.in );
	
	static int rectangle=0, diamond=0;
	static int line[] = new int[3];
	
	public static void main(String[] args) {
		
		while(read()) {
			solve();
		}
		
		System.out.println( rectangle );
		System.out.println( diamond );
		
	}
	
	public static boolean read() {
		if ( !sc.hasNext() ) return false;

		String tmp[] = sc.nextLine().split(",");
		
		for ( int i=0; i < tmp.length; i++ ) {
			line[i] = Integer.parseInt( tmp[i] );
		}
		
		return true;
	}
	
	public static void solve() {
		if ( line[0] == line[1] ) {
			diamond++;
		}
		if ( ( line[0] + line[1] ) == line[2] ) {
			rectangle++;
		}
	}

}