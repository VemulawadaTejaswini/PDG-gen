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
		long n = parseLong(sc.next());
		long k = parseLong(sc.next());
		sc.close();
		int ans = 0;
		if(k==10) {
			ans = (int) floor(log10(n)+1);
		} else {
			ans = (int) floor(log(n)/log(k)+1);
		}
		out.println(ans);
	}
}
