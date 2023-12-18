import java.util.Scanner;
import java.util.TreeSet;


public class Main {
	static class Range implements Comparable<Range>{
		long start;
		long depth;
		Range(long s , long d){
			start = s;
			depth = d;
		}
		public Range(Range r) {
			start = r.start;
			depth = r.depth;
		}
		@Override
		public int compareTo(Range o) {
			int c = Long.compare(start, o.start);
			if(c == 0){
				return Long.compare(o.depth, depth);
			}
			return c;
		}
		@Override
		public String toString() {
			return start+" "+depth;
		}
	}
	static class Reversi{
		long black;
		TreeSet<Range> tops;
		TreeSet<Range> lefts;
		public Reversi(int N) {
			long n = (long)N;
			tops = new TreeSet<Range>();
			lefts = new TreeSet<Range>();
			black = (n - 2) * (n - 2);
			Range r = new Range(2, n - 2);
			tops.add(r);
			lefts.add(r);
		}
		
		void put(int q, int x){
			TreeSet<Range> puts  = (q == 1) ? tops : lefts;
			TreeSet<Range> sides = (q == 1) ? lefts : tops;
			Range ins = puts.lower(new Range(x , -1));
			black -= ins.depth;
			if(ins.start == 2){
				Range p = new Range(puts.pollFirst());
				Range s = new Range(sides.pollFirst());
				s.depth = x - 2;
				sides.add(s);
				Range p2 = new Range(x + 1 , p.depth);
				puts.add(p);
				puts.add(p2);
			}
		}
		
		long black(){
			return black;
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		Reversi r = new Reversi(N);
		int Q = sc.nextInt();
		for(int q = 0 ; q < Q ; ++q){
			int a = sc.nextInt();
			int x = sc.nextInt();
			r.put(a, x);
		}
		System.out.println(r.black());
	}
}
