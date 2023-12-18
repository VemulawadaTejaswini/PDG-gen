
import java.util.*;
import static java.lang.Math.*;
import static java.util.Arrays.*;

public class Main {

	int INF = 1 << 28;

	Bag[] bags;
	int n;
	
	boolean ok(int x) {
		if( x == 0 ) return true;
		long sum = 0;
		
		PriorityQueue<Bag> que = new PriorityQueue<Bag>(1, new Comp());
		
		for(int i=0;i<x-1;i++) que.add(bags[i]);
		
		for(int i=0;i<x-1;i++) sum += bags[i].a;
		
		debug(x, sum);
		for (Bag bag: que) debug(" ", bag.a);
		
		for(int i=x-1;i<n;i++) {
			long min = x * bags[i].b - bags[i].a;
			if( sum <= min ) return true;
			sum += bags[i].a;
			que.add(bags[i]);
			sum -= que.remove().a;
		}
		
		return false;
	}
	
	void run() {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		bags = new Bag[n];
		
		for(int i=0;i<n;i++) bags[i] = new Bag(Integer.parseInt( sc.next() ), Integer.parseInt( sc.next() ) );
		sort(bags);
		
		for(Bag bag: bags) debug(bag.a, bag.b);
		
		int l = 0, r = n;
		
		while( r-l>1 ) {
			int c = (l+r) / 2;
			if( ok(c) ) l = c;
			else r = c;
		}
		System.out.println(ok(r)? r:l);
	}
	
	class Bag implements Comparable<Bag>{
		int a, b;
		Bag(int a, int b) {
			this.a = a;
			this.b = b;
		}
		@Override
		public int compareTo(Bag o) {
			// TODO 自動生成されたメソッド・スタブ
			return o.b - b;
		}
	}
	
	class Comp implements Comparator<Bag> {

		@Override
		public int compare(Bag o1, Bag o2) {
			// TODO 自動生成されたメソッド・スタブ
			return o2.a - o1.a;
		}
		
	}

	public static void main(String[] args) {
		new Main().run();
	}

	void debug(Object... os) {
//		System.err.println(Arrays.deepToString(os));
	}
}