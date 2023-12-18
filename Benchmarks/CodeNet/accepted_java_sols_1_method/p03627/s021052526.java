import java.util.*;
import static java.lang.Integer.*;
import static java.lang.Long.*;
//import static java.lang.Math.*;
import static java.lang.System.*;

public class Main {
	public static void main(String[] args) {
		int i,j;
		Scanner sc = new Scanner(in);
		int n = parseInt(sc.next());
		long[] a = new long[n];
		HashMap<Long, Integer> map = new HashMap<>();
		for(i=0;i<n;i++) {
			a[i] = parseLong(sc.next());
			map.put(a[i], map.containsKey(a[i])?map.get(a[i]) + 1:1);
		}
		sc.close();
		long ans=0;
		ArrayList<Long> keys = new ArrayList<Long>(map.keySet());
		Collections.sort(keys, Comparator.reverseOrder());
		ArrayList<Long> ab = new ArrayList<>();
		for(Long l:keys) {
			if(map.get(l)>=4) {
				ab.add(l);
				ab.add(l);
			} else if(map.get(l)>=2) {
				ab.add(l);
			}
			if(ab.size()>=2)break;
		}
		if(ab.size()<2) {
			ab.add(0L);
			ab.add(0L);
		}
		out.println(ab.get(0)*ab.get(1));
	}
}