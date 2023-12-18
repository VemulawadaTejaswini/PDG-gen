import java.util.*;

public class Main {
    public static void main (String [] args) {
	Scanner in = new Scanner(System.in);
	int n = in.nextInt();
	String ans = in.next(),str;


	for (int i = 0 ; i < n-1 ; i++) {
	    str = in.next();
	    if (str.compareTo(ans) < 0) {
		ans = str;
	    }
	}
	System.out.println(ans);
    }
}