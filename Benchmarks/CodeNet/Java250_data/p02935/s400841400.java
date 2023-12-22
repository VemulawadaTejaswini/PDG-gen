import java.util.*;

public class Main {
	Scanner sc;
	int N;
	int[] v;

	public Main() {
		sc = new Scanner(System.in);
	}
	
	private void calc() {
		N = sc.nextInt();
		v = new int[N];
		for (int i = 0; i < N; i++) v[i] = sc.nextInt();
		
		Arrays.sort(v);
		double ans = (double)v[0];
		for (int i = 1; i < N; i++) ans = (ans + v[i])/2d;
		
		System.out.println(ans);
		System.out.flush();
	}

	public static void main(String[] args) {
		new Main().calc();
	}

}