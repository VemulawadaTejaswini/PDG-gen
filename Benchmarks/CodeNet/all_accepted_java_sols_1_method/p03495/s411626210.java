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
		int k = parseInt(sc.next());
		HashMap<Integer, Integer> a = new HashMap<>();
		int aa=0;
		for(i=0;i<n;i++) {
			aa = parseInt(sc.next());
			if(a.get(aa) == null) {
				a.put(aa, 1);
			} else {
				a.put(aa, a.get(aa)+1);
			}
		}
		sc.close();
		ArrayList<Integer> list = new ArrayList<>(a.values());
		Collections.sort(list, Comparator.reverseOrder());
		int cnt=0;
		for(i=0;i<k&&i<list.size();i++) {
			cnt+=list.get(i);
		}
		out.println(n-cnt);
	}
}