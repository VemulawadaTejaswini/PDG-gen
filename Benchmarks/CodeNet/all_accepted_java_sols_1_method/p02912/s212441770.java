import java.util.*;
import static java.lang.Integer.*;
import static java.lang.Long.*;
import static java.lang.System.*;

public class Main {
	public static int MOD = 1000000007;
	public static void main(String[] args) {
		int i,j;
		Scanner sc = new Scanner(in);
		int n = parseInt(sc.next());
		int m = parseInt(sc.next());
		ArrayList<Long> al = new ArrayList<>();
		long sum = 0;
		long a = 0;
		for(i=0;i<n;i++) {
			a = parseInt(sc.next());
			sum += a;
			al.add(a);
		}
		sc.close();
		Collections.sort(al, Comparator.reverseOrder());
		Long[] at = al.toArray(new Long[al.size()]);
		ArrayList<Long> dif = new ArrayList<>();
		for (i = 1; i <= 31; i++) {
			long tmp=0;
			long tmp2=0;
			for (j = 0; j < at.length; j++) {
				tmp2 = at[j] >> 1;
				tmp = at[j] - tmp2;
				if(tmp == 0) break;
				at[j] = tmp2;
				dif.add(tmp);
			}
			if(j==0) break;
		}
		Collections.sort(dif, Comparator.reverseOrder());
		long dsum = 0;
		for (i = 0; i < Math.min(m, dif.size()); i++) {
			dsum += dif.get(i);
		}
		out.println(sum - dsum);
	}
}
