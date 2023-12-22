import java.util.*;
import static java.lang.Integer.*;
import static java.lang.Long.parseLong;
//import static java.lang.Long.*;
import static java.lang.Math.*;
import static java.lang.System.*;

public class Main {
	public static void main(String[] args) {
		int i,j;
		Scanner sc = new Scanner(in);
		int n = parseInt(sc.next());
		int m = parseInt(sc.next());
		int x = parseInt(sc.next());
		int[] a = new int[n+1];
		for (i = 0; i < m; i++) {
			a[parseInt(sc.next())] = 1;
		}
		sc.close();
		int cst0 = 0;
		for (i = x-1; i > 0; i--) {
			cst0 += a[i];
		}
		int cstn = 0;
		for (i = x+1; i < n; i++) {
			cstn += a[i];
		}
		out.println(Math.min(cst0, cstn));
	}
}
