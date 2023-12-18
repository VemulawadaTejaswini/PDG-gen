import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String s = "";
		s += in.next();
		s += in.next();
		s += in.next();
		if ( Integer.parseInt(s)%4 == 0 ) 
			System.out.println("YES");
		else 
			System.out.println("NO");
	}
}