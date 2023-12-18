import java.util.*;
import static java.lang.Integer.*;
import static java.lang.Long.*;
import static java.lang.Math.*;
import static java.lang.System.*;

public class Main {
	public static String UN = "UNRESTORABLE";
	public static void main(String[] args) {
		int i=0,j=0,k=0;
		Scanner sc = new Scanner(in);
		int n = parseInt(sc.next());
		HashMap<Integer, Integer> map = new HashMap<>();
		int a = 0;;
		Integer v = null;
		for(i=0;i<n;i++) {
			a = parseInt(sc.next());
			v = map.get(a);
			if(v == null) {
				map.put(a, 1);
			} else {
				map.put(a, v + 1);
			}
		}
		sc.close();
		for(Iterator<Integer> ii = map.keySet().iterator(); ii.hasNext();) {
			if(map.get(ii.next()) % 2 == 0) {
				ii.remove();
			}
		}
		out.println(map.keySet().size());
	}
}
