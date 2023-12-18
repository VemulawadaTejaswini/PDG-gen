
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
		int MAX = 150;
		Scanner sc = new Scanner(System.in);
		ArrayList<Rec> l = new ArrayList<Rec>();
		for(int y=1;y<MAX;y++) for(int x=y+1;x<MAX;x++) l.add(new Rec(x, y));
		Rec[] recs = l.toArray(new Rec[]{});
		sort(recs);
		for(;;) {
			int h = sc.nextInt(), w = sc.nextInt();
			if( (h|w) == 0 ) break;
			int ans = 0;
			for(ans=0;;ans++) if(recs[ans].x == w && recs[ans].y == h) break;
			System.out.println(recs[ans+1].y + " " + recs[ans+1].x);
		}
	}
	
	class Rec implements Comparable<Rec>{
		int x, y;
		Rec(int x, int y) {
			this.x = x;
			this.y = y;
		}
		public int compareTo(Rec o) {
			// TODO 自動生成されたメソッド・スタブ
			if( x*x + y*y != o.x*o.x + o.y*o.y )
				return (x*x + y*y) - (o.x*o.x + o.y*o.y);
			return y - o.y;
		}
	}
	
	void debug(Object... os) {
		System.err.println(Arrays.deepToString(os));
	}

	public static void main(String[] args) {
		new Main().run();
	}
}