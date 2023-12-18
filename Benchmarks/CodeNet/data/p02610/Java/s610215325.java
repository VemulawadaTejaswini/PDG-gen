import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {
	static class Pair implements Comparable<Pair>{
		int pos;
		long val;
		Pair(int p , long v){
			pos = p;
			val = v;
		}
		@Override
		public String toString() {
			return pos+" "+val;
		}
		@Override
		public int compareTo(Pair o) {
			if(pos == o.pos){
				return Long.compare(val, o.val);
			}
			return pos - o.pos;
		}
	}
	static class VComparator implements Comparator<Pair>{
		@Override
		public int compare(Pair o1, Pair o2) {
			return Long.compare(o1.val, o2.val);
		}
	}
	static long solveNeg(List<Pair> list){
		Collections.sort(list);
		Collections.reverse(list);
//		System.out.println(list);
		long S = 0;
		int N = list.size();
		for(Pair p : list){
			if(p.pos >= N - 1){
				S += p.val;
			}
			N--;
		}
		return S;
	}
	static long solvePos(List<Pair> list){
		Collections.sort(list);
		PriorityQueue<Pair> pq = new PriorityQueue<Pair>(new VComparator());
		for(Pair p : list){
			if(p.pos >= pq.size()){
				pq.add(p);
			}else{ // p.pos < pq.size()
				Pair t = pq.peek();
				if(t.val < p.val){
					pq.poll();
					pq.add(p);
				}
			}
		}
		long ret = 0;
		while(!pq.isEmpty()){
			Pair p = pq.poll();
			ret += p.val;
		}
		return ret;
	}
	static long solve(int K[] , long L[] , long R[]){
		long S = 0;
		for(long r : R){
			S += r;
		}
		long H[] = new long[L.length];
		List<Pair> pos = new ArrayList<Pair>();
		List<Pair> neg = new ArrayList<Pair>();

		for(int i = 0 ; i < H.length ; ++i){
			long h = L[i] - R[i];
			if(h >= 0){
				pos.add(new Pair(K[i] - 1, h));
			}else{
				neg.add(new Pair(K[i] - 1, h));
			}
		}
		for(int i = 0 ; i < neg.size(); ++i){
			neg.get(i).pos -= pos.size();
		}
		return S + solvePos(pos) + solveNeg(neg);
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int cn = 1 ; cn <= T ; ++cn){
			int N = sc.nextInt();
			int K[] = new int[N];
			long L[] = new long[N];
			long R[] = new long[N];
			for(int i = 0 ; i < N ; ++i){
				K[i] = sc.nextInt();
				L[i] = sc.nextLong();
				R[i] = sc.nextLong();
			}
			long ret = solve(K , L , R);
			System.out.println(ret);
		}
	}
}
