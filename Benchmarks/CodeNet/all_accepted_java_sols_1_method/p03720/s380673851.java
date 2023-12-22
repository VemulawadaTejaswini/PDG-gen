import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		int M = scanner.nextInt();
		int[] a = new int[M];
		int[] b = new int[M];
		int[] ans = new int[N + 1];
		for (int i = 0; i < M; i++) {
			a[i] = scanner.nextInt();
			b[i] = scanner.nextInt();
			ans[a[i]]++;
			ans[b[i]]++;
		}
		scanner.close();

		for(int i = 1; i < ans.length; i++) {
			System.out.println(ans[i]);
		}
	}

}
