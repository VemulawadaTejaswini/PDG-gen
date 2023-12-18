import java.util.*;

public class Main {
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
	            ret += x[idx];
	        }
	        return ret;
	    }
	    long sum(int l, int r)  { return sum(r) - sum(l); }
	    void add(int i, long v) {
	        for (int idx = i; idx <= n; idx += (idx & -idx)) {
	            x[idx] += v;
	        }
	    }
	};
	static class FT2{
		FenwickTree bit0;
		FenwickTree bit1;
		public FT2(int N) {
			bit0 = new FenwickTree(N);
			bit1 = new FenwickTree(N);
		}		
		void add(int l , int r, long x){
			bit0.add(l, - x * (l - 1));
			bit1.add(l, x);
			bit0.add(r + 1, x * r);
			bit1.add(r + 1, -x);
		}
		long sum(int i){
			return bit0.sum(i) + bit1.sum(i) * i;
		}
	}

	static class Query implements Comparable<Query>{
		int id;
		int l;
		int r;
		public Query(int idx , int a , int b) {
			id= idx;
			l = a;
			r = b;
		}
		@Override
		public int compareTo(Query o) {
			return r - o.r;
		}
	}
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int Q = sc.nextInt();
		int C[] = new int[N];
		for(int i = 0 ; i < N ; ++i){
			C[i] = sc.nextInt();
		}
		
		List<Query> queries = new ArrayList<>();
		for(int q = 0 ; q < Q ; ++q){
			int l = sc.nextInt();
			int r = sc.nextInt();
			queries.add(new Query(q, l , r));
		}
		int ans[] = new int[Q];
		Collections.sort(queries);
		FT2 ft2 = new FT2(N);
		int curR = 0;
		Map<Integer, Integer> occurance = new HashMap<Integer, Integer>();
		for(Query query : queries){
			if(curR < query.r){
				for(int r = curR ; r < query.r; ++r){
					int c = C[r];
					if(occurance.containsKey(c)){
						int l = occurance.get(c);
						ft2.add(l + 2, r + 1, 1);						
					}else{
						ft2.add(1, r + 1, 1);
					}
					occurance.put(c, r);
				}
				curR = query.r;
			}			
//			System.out.println(query.l+" "+query.r+" "+ft2.sum(query.l + 1) +" "+ ft2.sum(query.l));
			long ret = ft2.sum(query.l) - ft2.sum(query.l - 1);
			ans[query.id] = (int)ret;
		}
		for(int a : ans){
			System.out.println(a);
		}
	}
}
