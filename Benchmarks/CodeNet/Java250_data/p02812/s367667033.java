import java.util.*;

class Main {
	Scanner sc;
	
	private void calc() {
		sc = new Scanner(System.in);
		int N = sc.nextInt();
		String S = sc.next();
		int c = 0;
		for (int i = 0; i < N; i++) {
			int idx = S.indexOf("ABC", i);
			if (idx == -1) break;
			c++;
			i = idx + 2;
		}
		System.out.println(c);
	}

	public static void main(String[] args) {
		new Main().calc();
	}
}