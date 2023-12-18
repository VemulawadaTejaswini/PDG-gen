
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class Main {
	final static long MOD = 998244353l;
	static class FenwickTree {
	    int n;
	    long x[];
	    public FenwickTree(int N) {
	    	this.n = N;
	    	x = new long[N + 1] ;
		}
	    int size()  { return n; }
	    long sum(int i) {
	    	long ret = 0;
	        for (int idx = i; idx > 0; idx -= (idx & -idx)) {
	            ret = (ret + x[idx]) % MOD;
	        }
	        return ret % MOD;
	    }
	    long sum(int l, int r)  { return (sum(r) - sum(l - 1) + MOD) % MOD; }
	    void add(int i, long v) {
	        for (int idx = i; idx <= n; idx += (idx & -idx)) {
	            x[idx] = (x[idx] + v) % MOD;
	        }
	    }
	};

	static class Range implements Comparable<Range>{
		int start;
		int digit;
		int length;
		Range(int s , int d, int l){
			start = s;
			digit = d;
			length = l;
		}
		public Range(Range r) {
			start = r.start;
			digit = r.digit;
			length = r.length;
		}
		@Override
		public int compareTo(Range o) {
			int c = start - o.start;
			if(c == 0){
				return o.digit - digit;
			}
			return c;
		}
		@Override
		public String toString() {
			return start+" "+digit+" "+length;
		}
	}

	static void solve(int N , int L[] , int R[] , int D[]){
		FenwickTree ft = new FenwickTree(N);
		long pow = 1;
		ft.add(1, 1);
		for(int i = 1 ; i < N ; ++i){
			pow = (pow * 10) % MOD;
			ft.add(i + 1, pow);
		}
		long ret = ft.sum(1 , N);

		TreeSet<Range> digits = new TreeSet<Range>();
		digits.add(new Range(1, 1, N));
		for(int i = 0 ; i < L.length ; ++i){
			int li = L[i];
			int ri = R[i];
			int di = D[i];
			Range r = new Range(li , -1, 0);
			Range lr = digits.lower(r);
			if(ri <= lr.start + lr.length){
				if(lr.digit == di){
					continue;
				}
				digits.remove(lr);
				if(lr.start < li){
					Range r0 = new Range(lr.start, lr.digit, li - lr.start);
					digits.add(r0);
				}
				if(ri + 1 < lr.start + lr.length){
					Range r0 = new Range(ri + 1, lr.digit, lr.start + lr.length - (ri + 1));
					digits.add(r0);
				}
				Range r0 = new Range(li, di, ri - li + 1);
				digits.add(r0);
				long add = (ft.sum(N - ri + 1, N - li + 1) * di) % MOD;
				long del = (ft.sum(N - ri + 1, N - li + 1) * lr.digit) % MOD;
				ret = (ret + add + MOD - del) % MOD;
			}else{
				SortedSet<Range> next = digits.tailSet(lr);
				List<Range> removes = new ArrayList<Range>();
				Range ins = new Range(li, di, ri - li + 1);
				for(Range nr : next){
					removes.add(nr);
					if(ri <= nr.start + nr.length){
						if(ri + 1 < nr.start + nr.length){
							Range r0 = new Range(ri + 1, nr.digit, nr.start + nr.length - (ri + 1));
							digits.add(r0);
						}
						long base = ft.sum(N - (ins.start + ins.length - 1) + 1, N - nr.start + 1) ;							
						long add = (base * ins.digit) % MOD;
						long del = (base * nr.digit) % MOD;							
						ret = (ret + add + MOD - del) % MOD;
						break;
					}else{
						if(nr.start < ins.start){
							long base = ft.sum(N - (nr.start + nr.length - 1) + 1, N - ins.start + 1) ;							
							long add = (base * ins.digit) % MOD;
							long del = (base * nr.digit) % MOD;							
							ret = (ret + add + MOD - del) % MOD;
						}else{
							long base = ft.sum(N - (nr.start + nr.length - 1) + 1 , N - nr.start + 1) ;
							long add = (base * ins.digit) % MOD;
							long del = (base * nr.digit) % MOD;					
							ret = (ret + add + MOD - del) % MOD;
						}
					}			
				}
				for(Range rr : removes){
					digits.remove(rr);
				}
				if(lr.start < li){
					Range r0 = new Range(lr.start, lr.digit, li - lr.start);
					digits.add(r0);
				}
				digits.add(ins);
			}
//			System.out.println(digits);
			System.out.println(ret);
		}
	}
	public static void main(String[] args) {		
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int Q = sc.nextInt();
		int L[] = new int[Q];	
		int R[] = new int[Q];
		int D[] = new int[Q];
		for(int q = 0 ; q < Q ; ++q){
			L[q] = sc.nextInt();
			R[q] = sc.nextInt();
			D[q] = sc.nextInt();
		}
		solve(N , L , R , D);
	}
}
