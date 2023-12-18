import java.util.*;

/* No.10032 */
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Stack<String> s = new Stack<String>();
		int index = 0;
		while ( !sc.hasNext("quit") ) {
			String order = sc.next();
			if ( order.equals("push") )
				s.push(sc.next());
			else
				System.out.println(s.pop());
		}
	}
}