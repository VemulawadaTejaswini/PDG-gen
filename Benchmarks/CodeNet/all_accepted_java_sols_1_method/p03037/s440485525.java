import java.util.*;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		int[] L = new int[M];
		int[] R = new int[M];
		for (int i=0;i<M;i++) {
			L[i]=sc.nextInt();
			R[i]=sc.nextInt();
		}
		int l = 0;
		int r = 100001;
		for (int i=0;i<M;i++) {
			l=Math.max(l,L[i]);
			r=Math.min(r,R[i]);
		}
		if (r>=l) {
			System.out.println(r-l+1);
		} else {
			System.out.println(0);
		}
	}
}