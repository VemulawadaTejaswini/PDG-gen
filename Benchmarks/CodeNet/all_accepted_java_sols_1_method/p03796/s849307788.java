import java.util.*;
import java.io.PrintWriter;
import static java.lang.Integer.*;
import static java.lang.Long.*;
import static java.lang.Math.*;
import static java.lang.System.*;

public class Main {
	public static final long MOD =  1000000007L;
	public static void main(String[] args) {
		int i,j;
		Scanner sc = new Scanner(in);
		int n = parseInt(sc.next());
		sc.close();
		long a = 1;
		for (i = 1; i <= n; i++) {
			a*=i;
			if(a>=MOD) {
				a%=MOD;
			}
		}
		out.println(a);
	}
}
