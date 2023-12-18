import java.util.*;
import static java.lang.System.*;

public class Main {

	Scanner sc = new Scanner(in);
	
	void run() {
		List<Integer> W = new ArrayList<Integer>();
		List<Integer> D = new ArrayList<Integer>();
		List<Integer> res = new ArrayList<Integer>();
		while (true) {
			int n = sc.nextInt(), w = sc.nextInt(), d = sc.nextInt();
			if (n == 0 && w == 0 && d == 0) break;
			W.clear(); D.clear();
			W.add(w);
			D.add(d);
			for (int z = 0; z < n; z++) {
				int p = sc.nextInt()-1, s = sc.nextInt();
				int wi = W.get(p), di = D.get(p);
				W.remove(p); D.remove(p);
				
				s = s % (2*(wi+di));
				if (s < wi) {
					if (s <= wi-s) {
						W.add(s); D.add(di);
						W.add(wi-s); D.add(di);
					} else {
						W.add(wi-s); D.add(di);
						W.add(s); D.add(di);
					}
				} else if (s < wi+di) {
					if (s-wi <= wi+di-s) {
						W.add(wi); D.add(s-wi);
						W.add(wi); D.add(wi+di-s);
					} else {
						W.add(wi); D.add(wi+di-s);
						W.add(wi); D.add(s-wi);
					}
				} else if (s < wi+di+wi) {
					if (s-wi-di <= wi+di+wi-s) {
						W.add(s-wi-di); D.add(di);
						W.add(wi+di+wi-s); D.add(di);
					} else {
						W.add(wi+di+wi-s); D.add(di);
						W.add(s-wi-di); D.add(di);
					}
				} else {
					if (s-wi-di-wi <= wi+di+wi+di-s) {
						W.add(wi); D.add(s-wi-di-wi);
						W.add(wi); D.add(wi+di+wi+di-s);
					} else {
						W.add(wi); D.add(wi+di+wi+di-s);
						W.add(wi); D.add(s-wi-di-wi);
					}
				}
				
			}
			
			res.clear();
			for (int i = 0; i < W.size(); i++)
				res.add(W.get(i)*D.get(i));
			Collections.sort(res);
			
			out.print(res.get(0));
			for (int i = 1; i < W.size(); i++) {
				out.printf(" %d", res.get(i));
			}
			out.println();
		}
	}
	
	public static void main(String[] args) {
		new Main().run();
	}

}