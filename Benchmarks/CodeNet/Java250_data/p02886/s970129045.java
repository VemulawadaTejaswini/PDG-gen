import java.util.*;

class Main {
	Scanner sc;

	Main() {
		sc = new Scanner(System.in);
	}
	
	void calc() {
		int N = sc.nextInt();
		int[] d = new int[N];
		for (int i = 0; i < N; i++) d[i] = sc.nextInt();
		
		int sum = 0;
		for (int i = 0; i < N-1; i++) {
			for (int j = i+1; j < N; j++) {
				sum += d[i]*d[j];
			}
		}
		System.out.println(sum);
	}

	public static void main(String[] args) {
		new Main().calc();
	}
}