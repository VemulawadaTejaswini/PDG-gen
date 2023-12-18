import java.util.*;
import java.io.PrintWriter;
import static java.lang.Integer.*;
import static java.lang.Long.*;
import static java.lang.Math.*;
import static java.lang.System.*;

public class Main {
	public static int MOD = 1000000007;
	public static void main(String[] args) {
		long i,j;
		Scanner sc = new Scanner(in);
		long n = parseLong(sc.next());
		long k = parseLong(sc.next());
		sc.close();
		long sum=0;
		long lsum=0;
		long hsum=0;
		for (i = 0; i < k; i++) {
			lsum+=i;
			hsum+=(n-i);
		}
		for (i = k; i <= n+1; i++) {
//			out.printf("%d-%d%n", hsum,lsum);
			sum += hsum-lsum+1;
			if(sum>=MOD)sum%=MOD;
			lsum+=i;
			hsum+=(n-i);
		}
		out.println(sum);
	}
}
