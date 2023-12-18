import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {
	static class Pair implements Comparable<Pair>{
		String left;
		String right;
		long score;
		Pair(String l , String r, long s){
			left = l;
			right = r;
			score = s;
		}
		boolean isPalindrome(String str){
			for(int i = 0 ; i < str.length() ; ++i){
				char ci = str.charAt(i);
				char cj = str.charAt(str.length() - i - 1);
				if(ci != cj){
					return false;
				}
			}
			return true;
		}
		boolean isPalindrome(){
			if(left != null){
				return isPalindrome(left);
			}
			return isPalindrome(right);
		}
		@Override
		public int hashCode() {
			int h = (left != null ? left.hashCode() : 0);
			h = h * 31;
			h += (right != null ? right.hashCode() : 0);
			return h;
		}
		@Override
		public boolean equals(Object obj) {
			Pair o = (Pair)obj;
			if(left != null && o.left != null){
				return left.equals(o.left);
			}
			if(right != null && o.right != null){
				return right.equals(o.right);
			}
			return false;
		}
		@Override
		public int compareTo(Pair o) {
			return Long.compare(score, o.score);
		}
		
		public Pair adj(String str){
			int N = str.length();
			if(left != null){
				for(int i = 0; i < Math.min(left.length(), N) ; ++i){
					if(left.charAt(i) != str.charAt(N - 1 - i)){
						return null;
					}
				}
				if(left.length() <= N){
					return new Pair(null, str.substring(0, N - left.length()), 0);
				}else{
					return new Pair(left.substring(N), null, 0);					
				}
			}else{
				for(int i = 0; i < Math.min(right.length(), N) ; ++i){
					if(str.charAt(i) != right.charAt(right.length() - 1 - i)){
						return null;
					}
				}
				if(right.length() <= N){
					return new Pair(str.substring(right.length()), null, 0);					
				}else{
					return new Pair(null,right.substring(0, right.length() - N), 0);
				}
			}
//			return null;
		}
		@Override
		public String toString() {
			return left + " " + right;
		}
	}
	static long solve(String S[] , long C[]){
		PriorityQueue<Pair> q = new PriorityQueue<Pair>();
		Map<Pair, Long> vis = new HashMap<Pair, Long>();
		for(int i = 0 ; i < S.length ; ++i){
			Pair pi = new Pair(S[i] , null , C[i]);
			q.add(pi);
			vis.put(pi, C[i]);
		}
		while(!q.isEmpty()){
			Pair cp = q.poll();
//			System.out.println(cp);
			if(cp.isPalindrome()){
				return cp.score;
			}			
			for(int i = 0 ; i < S.length ; ++i){
				String si = S[i];
				long ci = C[i];
				Pair adj = cp.adj(si);
				if(adj == null){
					continue;
				}
//				System.out.println(" " + adj+" (" + si + ")");
				adj.score = cp.score + ci;
				if(!vis.containsKey(adj)){
					vis.put(adj, adj.score);
					q.add(adj);
				}else{
					long cost = vis.get(adj);
					if(adj.score < cost){
						vis.put(adj, adj.score);
						q.add(adj);						
					}
				}
			}
		}
		return -1;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		String S[] = new String[N];
		long C[] = new long[N];
		for(int i = 0 ; i < N ; ++i){
			S[i] = sc.next();
			C[i] = sc.nextLong();
		}
		long ret = solve(S , C);
		System.out.println(ret);
	}
}
