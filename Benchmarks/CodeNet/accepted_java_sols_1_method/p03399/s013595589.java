import java.util.*;
import static java.lang.System.*;
import static java.lang.Math.*;
public class Main {
	public static void main(String[] args) {
	    Scanner sc = new Scanner(in);
	    int A = sc.nextInt(), B = sc.nextInt(),
	        C = sc.nextInt(), D = sc.nextInt();
	    int ans = min(A,B) + min(C,D);
		out.println(ans);
	}
}