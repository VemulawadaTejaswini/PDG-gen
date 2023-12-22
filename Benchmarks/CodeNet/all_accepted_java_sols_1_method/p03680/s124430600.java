import java.util.Arrays;
import java.util.Scanner;

class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] a = new int[N];
		for(int i = 0; i < N; i++) a[i] = sc.nextInt();
		int now = 0;
		boolean[] isVisit = new boolean[N];
		Arrays.fill(isVisit, false);
		int ans = 0;
		while(true) {
			if(now == 1) break;
			if(isVisit[now]) break;
			isVisit[now] = true;
			now = a[now] - 1;
			ans++;
		}
		System.out.println((now == 1) ? ans : -1);
	}
}