import java.util.*;

class Main {
	Scanner sc;
	
	private void calc() {
		sc = new Scanner(System.in);
		int H = sc.nextInt();
		int N = sc.nextInt();
		long s = 0;
		for (int i = 0; i < N; i++) {
			s += sc.nextInt();
		}
		System.out.println((s>=H)?"Yes":"No");
	}

	public static void main(String[] args) {
		new Main().calc();
	}
}
