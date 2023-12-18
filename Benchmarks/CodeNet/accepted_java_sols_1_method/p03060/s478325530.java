import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		int N = reader.nextInt();
		int[] V = new int[N];
		int[] C = new int[N];
		int ans = 0;
		for (int i = 0; i < N;i++) {
			V[i] = reader.nextInt();
		}
		for (int i = 0; i < N;i++) {
			C[i] = reader.nextInt();
			ans += Math.max(0, V[i]-C[i]);
		}

		System.out.println(ans);
		reader.close();

	}
}



