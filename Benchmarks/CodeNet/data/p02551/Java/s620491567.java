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
			if(q == 1){
				Range r = tops.lower(new Range(x , -1));
				Range t0 = tops.first();
				black -= r.depth;
				if(t0.start != r.start){
					return ;
				}else{
					Range t = new Range(tops.pollFirst());
					Range l = new Range(lefts.pollFirst());
					l.depth = x - 2;
					lefts.add(l);
					Range t2 = new Range(x + 1, t.depth);
					tops.add(t);
					tops.add(t2);
				}
			}else{
				Range r = lefts.lower(new Range(x , -1));
				Range t0 = lefts.first();
				black -= r.depth;
				if(t0.start != r.start){
					return ;
				}else{
					Range t = new Range(lefts.pollFirst());
					Range l = new Range(tops.pollFirst());
					l.depth = x - 2;
					tops.add(l);
					Range t2 = new Range(x + 1, t.depth);
					lefts.add(t);
					lefts.add(t2);
				}
				
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
