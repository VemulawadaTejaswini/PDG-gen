import java.util.*;
import static java.lang.System.*;

public class Main {

	Scanner sc = new Scanner(in);
	
	class P {
		int x, y;
		P(int x, int y) {
			this.x = x;
			this.y = y;
		}
		@Override
		public boolean equals(Object o) {
			return x == ((P)o).x && y == ((P)o).y;
		}
		@Override
		public int hashCode() {
			return x*y+x+y;
		}
	}
	
	void run() {
		Set<P> set = new HashSet<P>();
		while (true) {
			int n = sc.nextInt();
			if (n == 0) break;
			set.clear();
			for (int i = 0; i < n; i++)
				set.add(new P(sc.nextInt(), sc.nextInt()));
			int res = 0;
			Iterator<P> it1 = set.iterator();
			while (it1.hasNext()) {
				P p1 = it1.next();
				Iterator<P> it2 = set.iterator();
				while (it2.hasNext()) {
					P p2 = it2.next();
					int dx = Math.abs(p1.y-p2.y), dy = Math.abs(p1.x-p2.x);
					if ((p1.y >= p2.y) == (p1.x >= p2.x)) {
						if (set.contains(new P(p1.x-dx,p1.y+dy)) && set.contains(new P(p2.x-dx,p2.y+dy))) {
							res = Math.max(res, dx*dx+dy*dy);
						} else if (set.contains(new P(p1.x+dx,p1.y-dy)) && set.contains(new P(p2.x+dx,p2.y-dy))) {
							res = Math.max(res, dx*dx+dy*dy);
						}
					} else {
						if (set.contains(new P(p1.x+dx,p1.y+dy)) && set.contains(new P(p2.x+dx,p2.y+dy))) {
							res = Math.max(res, dx*dx+dy*dy);
						} else if (set.contains(new P(p1.x-dx,p1.y-dy)) && set.contains(new P(p2.x-dx,p2.y-dy))) {
							res = Math.max(res, dx*dx+dy*dy);
						}
					}
				}
			}
			
			out.println(res);
		}
	}
	
	public static void main(String[] args) {
		new Main().run();
	}

}