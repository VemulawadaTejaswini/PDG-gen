import java.util.*;
public class Main {
	Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		new Main().start();
	}
	Main() { sc.useDelimiter("\n|,| |"); }
	void start() {
		int N,W=0;
		N = sc.nextInt();
		W = sc.nextInt();
		int[] ab = new int[N];
		for(int i = 0; i < N; i++) ab[i] = i+1;
		for(int i = 0; i < W; i++) {
			int a, b, tmp = 0;
			a = sc.nextInt()-1;
			b = sc.nextInt()-1;
			tmp = ab[a];
			ab[a] = ab[b];
			ab[b] = tmp;
		}
		for(int i = 0; i < ab.length; i++) {
			System.out.println(ab[i]);
		}
	}
}