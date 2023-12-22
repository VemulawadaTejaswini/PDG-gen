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
		int x = parseInt(sc.next());
		int n = parseInt(sc.next());
		int[] p = new int[n];
		for (i = 0; i < n; i++) {
			p[i] = parseInt(sc.next());
		}
		sc.close();
		Arrays.parallelSort(p);
		int ans=0;
		for (i = 0; i <= 100; i++) {
			if(Arrays.binarySearch(p, x-i)<0) {
				ans=x-i;
				break;
			} else if(Arrays.binarySearch(p, x+i)<0) {
				ans=x+i;
				break;
			}
		}
		out.println(ans);
	}
}
