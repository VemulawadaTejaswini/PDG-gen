import java.util.*;
import static java.util.Arrays.*;
import static java.lang.Math.*;

// AOJ 0065
public class Main {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		
		HashMap<Integer, C>[] hs = new HashMap[2];
		TreeSet<Integer> is = new TreeSet<Integer>();
		for (int i = 0; i < 2; i++) hs[i] = new HashMap<Integer, C>();
		
		int m = 0;
		while (sc.hasNextLine()) {
			String[] ss = sc.nextLine().split(",");
			if (ss.length == 1) {
				m++;
				continue;
			}
			
			int n = new Integer(ss[0]), t = new Integer(ss[1]);
			if (hs[m].containsKey(n)) 
				hs[m].put(n, new C(n, 1 + hs[m].get(n).t));
			else 	
				hs[m].put(n, new C(n, 1));
			
			
			if (m == 1 && hs[0].containsKey(n))
				is.add(n);
		}
		
		for (Iterator<Integer> i = is.iterator(); i.hasNext(); ){
			Integer ii = i.next();
			System.out.println(ii + " " + (hs[0].get(ii).t + hs[1].get(ii).t));
			
		}

	}
}

class C implements Comparable<C> {
	int n, t;
	C (int n, int t) {
		this.n = n;
		this.t = t;
	}
	
	public int compareTo(C c) {
		return this.n - c.n;
	}
}