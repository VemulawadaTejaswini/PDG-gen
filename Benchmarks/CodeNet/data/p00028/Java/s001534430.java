import java.util.*;
import static java.util.Arrays.*;
import static java.lang.Math.*;

// AOJ 0010
public class Main {

	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		int num = 0;
		int[] hist = new int[101];
		fill(hist, 0);
		while (sc.hasNextInt()) {
			hist[sc.nextInt()]++;
		}
		
		C[] cs = new C[100];
		for (int i = 1; i <= 100; i++) 
			cs[i - 1] = new C(i, hist[i]);
		
		sort(cs);
		System.out.println(cs[99].k);
		for (int i = 98; i >= 0 && cs[i].v == cs[99].v; i--) System.out.println(cs[i].k);
	}
}

class C implements Comparable<C> {
	int k, v;
	C (int k, int v) {
		this.k = k;
		this.v = v;
	}
	
	public int compareTo(C c) {
		if (this.v == c.v) {
			return c.k - this.k;
		} else {
			return this.v - c.v;			
		}

	}
}