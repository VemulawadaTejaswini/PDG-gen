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
		int m = parseInt(sc.next());
		int[] a = new int[m];
		long sum=0;
		for (i = 0; i < m; i++) {
			a[i] = parseInt(sc.next());
			sum+=a[i];
		}
		sc.close();
		long dif = n -sum;
		out.println(dif<0?-1:dif);
	}
}
