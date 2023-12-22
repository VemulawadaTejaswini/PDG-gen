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
		long a = parseLong(sc.next());
		long b = parseLong(sc.next());
		long c = parseLong(sc.next());
		long k = parseLong(sc.next());
		sc.close();
		long ans=0;
		ans=Math.min(a, k);
		k=Math.max(k-a-b, 0);
		if(k>0) {
			ans-=Math.min(c, k);
		}
		out.println(ans);
	}
}
