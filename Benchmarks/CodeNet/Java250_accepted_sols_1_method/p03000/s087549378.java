import java.util.Scanner;

public class Main {

	public static void main(final String[] args) {

		final Scanner sc = new Scanner(System.in);
		int N = Integer.parseInt(sc.next());
		int X = Integer.parseInt(sc.next());
		int[] l = new int[N];
		for (int i = 0; i < N; i++) {
			l[i] = Integer.parseInt(sc.next());
		}
		sc.close();

		int d = 0;
		int ans = 1;
		for (int i = 0; i < N; i++) {
			d += l[i];
			if (d <= X) {
				ans++;
			}
		}
		System.out.println(ans);
	}

}
