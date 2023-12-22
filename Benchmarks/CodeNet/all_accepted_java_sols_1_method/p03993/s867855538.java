import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();

		int[] list = new int[N + 1];
		int ans = 0;

		for (int i = 1; i < N+1; i++) {
			list[i] = sc.nextInt();
		}

		for (int i = 1; i < list.length; i++) {
			if (i == list[list[i]]) {
				ans++;
			}
		}

		System.out.println(ans/2);

	}

}
