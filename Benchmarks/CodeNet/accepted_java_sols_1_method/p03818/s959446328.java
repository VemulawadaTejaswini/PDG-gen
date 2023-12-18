import java.util.*;
import static java.lang.Integer.*;
import static java.lang.Double.*;
import static java.lang.Long.*;
import static java.lang.Math.*;
import static java.lang.System.*;
import static java.lang.Math.*;
import java.io.PrintWriter;

public class Main {
	public static void main(String[] args) {
		int i,j;
		Scanner sc = new Scanner(in);
		int n = parseInt(sc.next());
		HashMap<Integer, Integer> a = new HashMap<>();
//		int[] a = new int[n];
		int tmp = 0;
		for (i = 0; i < n; i++) {
			tmp = parseInt(sc.next());
			if(a.get(tmp) == null) {
				a.put(tmp, 1);
			} else {
				a.put(tmp, a.get(tmp)+1);
			}
		}
		sc.close();
		ArrayList<Integer> list = new ArrayList<>(a.keySet());
//		Arrays.parallelSort(a);
		int cnt = 0;
		for (Integer ii : list) {
			cnt += a.get(ii) - 1;
		}
		int ans = list.size();
		if(cnt%2==1) {
			ans--;
		}
		out.println(ans);
	}
}
