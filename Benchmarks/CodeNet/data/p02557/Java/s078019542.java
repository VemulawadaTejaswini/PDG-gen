import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {
	static int[] toArray(String s , int N){
		int ret[] = new int[N];
		String a[] = s.split(" ");
		for(int i = 0 ; i < N ; ++i){
			ret[i] =Integer.parseInt(a[i]);
		}
		return ret;
	}
	static class Pair implements Comparable<Pair>{
		int x;
		int cnt;
		public Pair(int v , int c) {
			x = v;
			cnt = c;
		}
		@Override
		public int compareTo(Pair o) {
			return o.cnt - cnt;
		}
		@Override
		public String toString() {
			return x+" "+cnt;
		}
	}
	static class P implements Comparable<P>{
		int a;
		int b;
		public P(int a , int b){
			this.a = a;
			this.b = b;
		}
		@Override
		public int compareTo(P o) {
			return a - o.a;
		}
		@Override
		public String toString() {
			return a+" "+b;
		}
	}
	static void add(List<P> lst , int a , int b , int N){
		for(int i = 0 ; i < N ; ++i){
			lst.add(new P(a, b));
		}
	}
	static void solve(int[] A , int[] B){
		int N = A.length;
		int countA[] = new int[N + 1];
		int countB[] = new int[N + 1];
		for(int x : A){
			countA[x]++;
		}
		for(int x : B){
			countB[x]++;		
		}
		List<Pair> lstA = new ArrayList<Pair>();
		for(int i = 0 ; i < countB.length ; ++i){
			int a = countA[i];
			int b = N - countB[i];
			if(a > b){
				System.out.println("No");
				return ;
			}
		}
//		System.out.println(Arrays.toString(countB));
		PriorityQueue<Pair> pb = new PriorityQueue<Pair>();
		for(int i = 0 ; i < countA.length ; ++i){
			if(countA[i] != 0){
				lstA.add(new Pair(i, countA[i]));
			}
			if(countB[i] != 0){
				pb.add(new Pair(i, countB[i]));
			}
		}
//		System.out.println(pb);
		List<P> result = new ArrayList<P>();
		Collections.sort(lstA);
		for(Pair p : lstA){
			int cnt = p.cnt;
			Pair top = pb.peek();
//			System.out.println(p.x+" "+p.cnt);
//			System.out.println(top);
			if(p.x == top.x){
				Pair kp = pb.poll();
				while(!pb.isEmpty() && cnt > 0){
					Pair v = pb.poll();
					if(v.cnt <= cnt){
						cnt -= v.cnt;
						add(result, p.x, v.x , v.cnt);
					}else{ // v.cnt > cnt
						v.cnt -= cnt;
						add(result, p.x, v.x , cnt);
						cnt = 0;
						pb.add(v);
					}
				}
				pb.add(kp);
			}else{
				Pair kp = null;
				while(!pb.isEmpty() && cnt > 0){
					Pair v = pb.poll();
					if(v.x == p.x){
						kp = v;
					}else{
						if(v.cnt <= cnt){
							cnt -= v.cnt;
							add(result, p.x, v.x , v.cnt);
						}else{ // v.cnt > cnt
							v.cnt -= cnt;
							add(result, p.x, v.x , cnt);
							cnt = 0;
							pb.add(v);
						}						
					}
				}
				if(kp != null){
					pb.add(kp);
				}
			}
		}
		Collections.sort(result);
//		System.out.println(result);
		System.out.println("Yes");
		StringBuilder ret = new StringBuilder();
		for(P p : result){
			if(ret.length() > 0){
				ret.append(' ');
			}
			ret.append(p.b);
		}
		System.out.println(ret);
	}
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		String AS = br.readLine();
		String BS = br.readLine();
		int A[] = toArray(AS, N);
		int B[] = toArray(BS, N);
		solve(A, B);
	}
}
