import java.util.*;

public class Main {
    public static void main (String [] args) {
	Scanner in = new Scanner(System.in);

	while (true) {
	    String str = in.next();

	    if (str.equals("-")) {
		break;
	    }

	    int m = in.nextInt();
	    for (int i = 0 ; i < m ; i++) {
		int h = in.nextInt();
		String x = str.substring(0,h);
		String y = str.substring(h);      
		str = y + x;
	    }

	    System.out.println(str);
	}
    }
}