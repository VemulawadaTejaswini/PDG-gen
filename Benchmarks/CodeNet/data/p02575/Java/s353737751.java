import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.List;
import java.util.Scanner;
import java.util.SortedSet;
import java.util.TreeSet;




public class Main {
	static int[] solve(int start, int A[] , int B[] , int W){
		int H = A.length;
		if(start < 0 || start >= W){
			int r[] = new int[H];
			Arrays.fill(r, -1);
			return r;
		}
		int result[] = new int[H];
		Arrays.fill(result, -1);
		int move = 0;
		int cp = start;
		for(int i = 0 ; i < A.length ; ++i){
			int l = A[i];
			int r = B[i];
			if(cp < l || cp > r){
				move++;
				result[i] = move;
			}else{
				move += r - cp + 1;
				cp = r + 1;
				if(cp >= W){ // can't move
					break;
				}
				move++;
				result[i] = move;
			}
		}
		return result;
	}
	static class Range implements Comparable<Range>{
		long left;
		long right;
		public Range(long l , long r) {
			left = l;
			right = r;
		}
		@Override
		public int compareTo(Range o) {
			int c = Long.compare(left, o.left);
			if(c == 0){
				return Long.compare(right, o.right);
			}
			return c;
		}
		@Override
		public boolean equals(Object obj) {
			Range o = (Range)obj;
			return left == o.left && right == o.right;
		}
		@Override
		public String toString() {
			return left+" "+right;
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int H = sc.nextInt();
		int W = sc.nextInt();
		int A[] = new int[H];
		int B[] = new int[H];		
		for(int i = 0 ; i < A.length ; ++i){
			A[i] = sc.nextInt() - 1;
			B[i] = sc.nextInt() - 1;
		}
		int hl[] = solve(A[0] - 1 , A , B, W);
		int hr[] = solve(B[0] + 1 , A , B, W);
//		System.out.println(Arrays.toString(hl));
//		System.out.println(Arrays.toString(hr));
		BitSet bs = new BitSet(W);
		int totW = 0;
		for(int i = 0 ; i < H ; ++i){
			int a = A[i];
			int b = B[i];
			bs.set(a, b + 1);
			int w = bs.cardinality();
			int li = hl[i];
			int ri = hr[i];
			if(li < 0 && ri < 0){
				System.out.println(-1);
			}else if(li >= 0 && ri >= 0){
				int r = Math.min(li, ri);
				if(w < W){
					r = Math.min(r, i + 1);
				}
				System.out.println(Math.min(li, ri));				
			}else{
				System.out.println(li);
			}
		}
	}
}
