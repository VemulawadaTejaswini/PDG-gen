import java.util.*;

class Main {
	Scanner sc;
	int N, K;
	
	private void calc() {
		sc = new Scanner(System.in);
		N = sc.nextInt();
		K = sc.nextInt();
		
		int d = 1;
		while (N >= K) {
			d++;
			N /= K;
		}
		System.out.println(d);
	}

	public static void main(String[] args) {
		new Main().calc();
	}
}
