import java.util.*;
import static java.lang.Integer.*;
import static java.lang.Long.*;
import static java.lang.Math.*;
import static java.lang.System.*;

public class Main {
	public static int N = 3;
	public static void main(String[] args) {
		int i,j;
		Scanner sc = new Scanner(in);
		int n = parseInt(sc.next());
		int k = parseInt(sc.next());
		int x = parseInt(sc.next());
		int y = parseInt(sc.next());
		sc.close();
		out.println(k<n?k*x+(n-k)*y:n*x);
	}
}
