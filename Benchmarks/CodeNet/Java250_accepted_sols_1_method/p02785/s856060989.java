import java.util.*;
import java.io.PrintWriter;
import static java.lang.Integer.*;
import static java.lang.Long.*;
import static java.lang.Math.*;
import static java.lang.System.*;

public class Main {
	public static final int MOD = 1000000007;
	public static ArrayList<Integer> list = new ArrayList<>();
	public static void main(String[] args) {
		int i,j;
		Scanner sc = new Scanner(in);
		int n = parseInt(sc.next());
		int k = parseInt(sc.next());
		long[] h = new long[n];
		for (i = 0; i < h.length; i++) {
			h[i] = parseInt(sc.next());
		}
		sc.close();
		Arrays.parallelSort(h);
		long sum=0;
		for (i = n-k-1; i >= 0; i--) {
			sum+=h[i];
		}
		out.println(sum);
	}
}
