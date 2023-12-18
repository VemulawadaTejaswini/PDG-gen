import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;


public class Main {
	static Scanner sc = new Scanner(System.in);
	static int n;
	//
	List<Disc> discs = new ArrayList<Disc>();
	int max = 0;

	public static void main(String[] args) {
		while(true) {
			n = sc.nextInt();
			if(n == 0) break;

			new Main();
		}
	}

	Main() {
		for(int i=0; i<n; i++) {
			discs.add( new Disc(sc, i) );
		}

		dfs(new HashSet<Disc>());

		System.out.println(max);
	}

	void dfs(Set<Disc> rems) {
		// pre
		List<Disc> ups = new ArrayList<Disc>();
//		Predicate<Disc> booAny = d -> {
//			for(int i=d.m-1; i>=0; i--) {
//				Disc op = discs.get(i);
//				if(rems.contains(op)) continue;
//				if(d.boo(op)) {
//					return true;
//				}
//			}
//			return false;
//		};
		for(Disc d : discs) {
			if(rems.contains(d)) continue;
			if( ! booAny(d, rems) ) ups.add(d);
		}

	//	System.out.println(ups);

		// dfs
		for(int i=0; i<ups.size(); i++) {
			for(int j=i+1; j<ups.size(); j++) {
				Disc a = ups.get(i);
				Disc b = ups.get(j);
				if(a.c == b.c) {
					rems.add(a); rems.add(b);
					max = Math.max(max, rems.size());
				//	System.out.println(a+","+b+" "+max);
					dfs(rems);
					rems.remove(a); rems.remove(b);
				}
			}
		}

	}

	boolean booAny(Disc d, Set<Disc> rems) {
		for(int i=d.m-1; i>=0; i--) {
			Disc op = discs.get(i);
			if(rems.contains(op)) continue;
			if(d.boo(op)) {
				return true;
			}
		}
		return false;
	}

}


class Disc {
	int x, y, r, c;
	int m;

	Disc(Scanner sc, int n) {
		x = sc.nextInt();
		y = sc.nextInt();
		r = sc.nextInt();
		c = sc.nextInt();
		m = n;
	}

	boolean boo(Disc op) {
		int kyo = (x-op.x)*(x-op.x) + (y-op.y)*(y-op.y);
		int rs = (r+op.r)*(r+op.r);
		return kyo < rs;
	}

	@Override
	public String toString() {
		return ""+m;
	}

}