import java.util.*;

class Main {
	public static void main(String[] args) {
		//data nyuroku
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int d[] = new int[N];
		for (int i=0;i<N;i++) {
			d[i] = sc.nextInt();
		}
		//sort
		Arrays.sort(d);
		//mochimochi
		int n=N;
		for(int i=0;i<N-1;i++) {
			if (d[i]==d[i+1]) {
				n--;
			}
		}
		System.out.println(n);
	}
}