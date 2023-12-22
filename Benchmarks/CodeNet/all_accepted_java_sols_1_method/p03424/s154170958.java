import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt(); in.nextLine();

		boolean hasYellow = false;
		String s = "";
		for ( int i = 0; i < n; i++ ) {
			s = in.next();
			if ( s.equals("Y") ) {
				hasYellow = true;
				break;
			}
		}
		
		if ( hasYellow )
			System.out.println("Four");
		else
			System.out.println("Three");
	}
}