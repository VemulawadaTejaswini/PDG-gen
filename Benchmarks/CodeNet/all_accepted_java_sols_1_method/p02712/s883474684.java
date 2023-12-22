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
		int n = parseInt(sc.next());
		sc.close();
		long sum=0;
		for (i = 1; i <= n; i++) {
			if(i%3==0||i%5==0) continue;
			sum+=i;
		}
		out.println(sum);
	}
}
