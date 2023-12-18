import java.util.*;
import java.io.PrintWriter;
import static java.lang.Integer.*;
import static java.lang.Long.*;
import static java.lang.Math.*;
import static java.lang.System.*;

public class Main {
	public static final int MOD = 1000000007;
	public static void main(String[] args) {
		int i,j;
		Scanner sc = new Scanner(in);
		String s = sc.next();
		String t = sc.next();
		int a = parseInt(sc.next());
		int b = parseInt(sc.next());
		String u = sc.next();
		sc.close();
		out.print(u.equals(s)?a-1:a);
		out.print(" ");
		out.println(u.equals(t)?b-1:b);
	}
}
