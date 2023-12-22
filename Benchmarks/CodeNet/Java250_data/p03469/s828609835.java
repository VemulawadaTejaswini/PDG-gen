import java.util.*;
import static java.lang.System.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		A(sc);
	}
	
	public static void A(Scanner sc) {
		String s = sc.next();
		out.println(s.substring(0,3) + 8 + s.substring(4,10));
	}
}
