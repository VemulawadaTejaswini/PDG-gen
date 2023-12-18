import java.util.*;

import static java.lang.Integer.parseInt;
//import static java.lang.Integer.*;
//import static java.lang.Long.*;
//import static java.lang.Math.*;
import static java.lang.System.*;

public class Main {
	public static int MOD = 1000000007;
	public static void main(String[] args) {
		int i,j;
		Scanner sc = new Scanner(in);
		int n = parseInt(sc.next());
		sc.close();
		out.println((double)((n/2)+(n%2))/n);
	}
}
