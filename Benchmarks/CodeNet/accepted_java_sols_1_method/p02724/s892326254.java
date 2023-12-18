import java.util.*;
import java.io.PrintWriter;
import static java.lang.Integer.*;
import static java.lang.Long.*;
import static java.lang.Math.*;
import static java.lang.System.*;

public class Main {
	public static final int MOD = 1000000007;
	public static final int M = 3;
	public static void main(String[] args) {
		int i,j;
		Scanner sc = new Scanner(in);
		long x = parseLong(sc.next());
		sc.close();
		long y500 = x / 500;
		x %= 500;
		long y5 = x / 5;
		out.println(y500*1000+y5*5);
	}
}
