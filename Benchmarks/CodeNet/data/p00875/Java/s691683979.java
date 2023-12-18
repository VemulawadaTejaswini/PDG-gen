
import java.util.*;
import java.io.*;
import static java.util.Arrays.*;
import static java.util.Collections.*;
import static java.lang.Math.*;

public class Main {

	int INF = 1 << 28;
	//long INF = 1L << 62;
	double EPS = 1e-10;

	void run() {
		Scanner sc = new Scanner(System.in);
		for(;;) {
			int n = sc.nextInt();
			if(n == 0) break;
			HashMap<String, String> map = new HashMap<String, String>();
			for(int i=0;i<n;i++) map.put(sc.next(), sc.next());
			Strs[] obts = new Strs[2];
			for(int i=0;i<2;i++) obts[i] = new Strs();
			String src = sc.next(), dst = sc.next();
			int cnt = 0; obts[0].add(src);
			boolean ok = false;
			HashSet<String> used = new HashSet<String>(); used.add(src);
			for(;!obts[cnt%2].isEmpty();cnt++) {
//				debug(obts[cnt%2]);
				obts[(cnt+1)%2].clear();
				for(String str: obts[cnt%2]) {
					if(str.equals(dst)) {
						ok = true;
						break;
					}
					for(Map.Entry<String, String> entry: map.entrySet()) {
						String rep = str.replace(entry.getKey(), entry.getValue());
						if(rep.length() <= dst.length() && !used.contains(rep)) {
							obts[(cnt+1)%2].add(rep);
							used.add(rep);
						}
					}
				}
				
				if(ok) break;
			}
			
			System.out.println((ok? cnt:-1));
		}
	}
	
	class Strs extends HashSet<String>{}

	void debug(Object... os) {
		System.err.println(Arrays.deepToString(os));
	}

	public static void main(String[] args) {
		new Main().run();
	}
}