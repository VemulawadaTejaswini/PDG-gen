import static java.lang.System.*;
import java.util.*;
public class Main {
	public static void main(String[] args) {
	    Scanner sc = new Scanner(in);
	    long N = sc.nextLong()-1;
	    long ans = N*(N+1)/2;
		out.println(ans);
	}
}