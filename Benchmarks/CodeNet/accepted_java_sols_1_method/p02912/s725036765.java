import java.util.*;
import static java.lang.Integer.*;
//import static java.lang.Long.*;
import static java.lang.System.*;

public class Main {
	public static int MOD = 1000000007;
	public static void main(String[] args) {
		int i,j;
		Scanner sc = new Scanner(in);
		int n = parseInt(sc.next());
		int m = parseInt(sc.next());
		PriorityQueue<Integer> a = new PriorityQueue<>(Comparator.reverseOrder());
		for(i=0;i<n;i++) {
			a.add(parseInt(sc.next()));
		}
		sc.close();
		for (i = 0; i < m; i++) {
			a.add(a.poll()>>1);
		}
		long sum = 0;
		for (Integer ii: a) {
			sum += ii;
		}
		out.println(sum);
	}
}
