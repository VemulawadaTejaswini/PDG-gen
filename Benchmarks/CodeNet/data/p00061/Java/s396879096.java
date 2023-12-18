import java.util.*;
import static java.util.Arrays.*;
import static java.lang.Math.*;

// AOJ 0061
public class Main {
	static Scanner sc = new Scanner(System.in);
	static final double EPS = 1e-8;
	public static void main(String[] args) {
		
		ArrayList<C> ary = new ArrayList<C>();
		while (true) {
			String[] ss = sc.next().split(",");
			int a = new Integer(ss[0]), b = new Integer(ss[1]);
			if (a == 0 && b == 0) break;
			ary.add(new C(a, b));
		}
		
		C[] cs = new C[ary.size()];
		for (int i = 0; i < cs.length; i++) cs[i] = ary.get(i);
		sort(cs);
		
		cs[0].rank = 1;
		for (int i = 1; i < cs.length; i++)
			if (cs[i].score == cs[i - 1].score)
				cs[i].rank = cs[i - 1].rank;
			else
				cs[i].rank = cs[i - 1].rank + 1;
		
		
		while (sc.hasNextInt()) {
			int q = sc.nextInt();
			for (int i = 0; i < cs.length; i++) {
				if (cs[i].no == q) {
					System.out.println(cs[i].rank);
					break;
				}
			}
		}
	}
}

class C implements Comparable<C> {
	int no, score, rank;
	C (int no, int score) {
		this.no = no;
		this.score = score;
	}
	
	public int compareTo(C c) {
		return c.score - this.score;
	}
	
	public String toString() {
		return this.no + " " + this.score + " " + this.rank;
	}
}