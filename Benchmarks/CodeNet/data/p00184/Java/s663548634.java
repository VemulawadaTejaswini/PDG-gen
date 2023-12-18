import java.util.*;

class Main {


	public static void main(String args[]){
		Scanner in = new Scanner(System.in);
		for(;;){
			int n = in.nextInt();
			if(n==0) break;
			int a[] = new int[n];
			for(int i=0; i<n; i++) a[i] = in.nextInt();
			solve(a);
		}
	}

	static void solve(int[] a){
		int cnt[] = new int[7];
		for(int i=0; i<a.length; i++) cnt[(a[i]/10 > 6)?6:a[i]/10]++;
		for(int i=0; i<7; i++) System.out.println(cnt[i]);
	}
}