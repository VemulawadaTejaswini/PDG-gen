import java.util.*;

public class Main {
    public static void main (String [] args) {
	Scanner in = new Scanner(System.in);
	Stack <String> st = new Stack <String> ();
	String s;

	while (true) {
	    String order = in.next();

	    if (order.equals("push")) {
		s = in.next();
		st.push(s);
	    } else if (order.equals("pop")) {
		System.out.println(st.pop());
	    } else {
		break;
	    }
	}
    }
}