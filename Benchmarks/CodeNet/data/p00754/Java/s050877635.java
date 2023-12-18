import java.util.*;

public class Main {
	Scanner sc = new Scanner(System.in);
	
	void run() {
		while (true) {
			String str = sc.nextLine();
			if( str.equals(".") )break;
			System.out.println( isClosed(str)? "yes":"no" );
		}
	}
	
	boolean isClosed( String str ) {
		LinkedList<Character> kakko = new LinkedList<Character>();
		for(int i=0;i<str.length();i++) {
			char c = str.charAt(i);
//			System.out.print(c);
			if( c == '(' || c == '[' ) kakko.addLast(c);
			else if( c == ')' ) {
				if( kakko.isEmpty() || kakko.removeLast() != '(' ) return false; 
			}
			else if( c == ']' ) {
				if( kakko.isEmpty() || kakko.removeLast() != '[' ) return false; 
			}
		}
		if ( !kakko.isEmpty() ) return false;
		return true;
	}
	
	public static void main(String[] args) {
		new Main().run();
	}
	
}