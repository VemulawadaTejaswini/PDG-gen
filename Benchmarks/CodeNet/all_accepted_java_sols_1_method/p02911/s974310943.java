import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		long K = sc.nextLong();
		int Q = sc.nextInt();
		
		long[] seikai = new long[N];
		for (int i=0; i<Q; i++) {
			int A = sc.nextInt();
			seikai[A-1]++;
		}

		StringBuilder sb = new StringBuilder();
		for (int i=0; i<N; i++) {
			sb.append((K - (Q - seikai[i]) <= 0 ? "No" : "Yes") + "\n");
		}
		System.out.println(sb);
	}
}