import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		long[] L = new long[N];
		long[] R = new long[N];
		int a, al, ar;
		for(int i = 0; i < N; i++) {
			a = scanner.nextInt();
			al = i + a; if(al < N) L[al]++;
			ar = i - a; if(ar > -1) R[ar]++;
		}
		long count = 0;
		for(int i = 0; i < N; i++) {
			count += L[i] * R[i];
		}
		System.out.println(count);
	}
}
