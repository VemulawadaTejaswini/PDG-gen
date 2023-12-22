import java.util.*;

class Main {
	Scanner sc;
	int N;
	
	private void calc() {
		sc = new Scanner(System.in);
		N = sc.nextInt();
		boolean approved = true;
		for (int i = 0; i < N; i++) {
			int A = sc.nextInt();
			if (!approved) continue;
			if (A%2 != 0) continue;
			if (A%2 == 0 && (A%3 == 0 || A%5 == 0)) continue;
			approved = false;
		}
		System.out.println(approved?"APPROVED":"DENIED");
	}

	public static void main(String[] args) {
		new Main().calc();
	}
}
