import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		int M = scanner.nextInt();
		int[] Hs = new int[N];
		for(int i = 0; i < N; i++) Hs[i] = scanner.nextInt();
		boolean[] Gs = new boolean[N];
		for(int i = 0; i < N; i++) Gs[i] = true;
		for(int i = 0; i < M; i++) {
			int A = scanner.nextInt() - 1;
			int B = scanner.nextInt() - 1;
			if(Hs[A] == Hs[B]) {
				Gs[B] = Gs[A] = false;
			}
			else if(Hs[A] > Hs[B]) {
				Gs[B] = false;
			} else {
				Gs[A] = false;
			}
		}
		int count = 0;
		for(int i= 0; i < N; i++) {
			if(Gs[i]) count++;
		}
		System.out.println(count);
	}
}