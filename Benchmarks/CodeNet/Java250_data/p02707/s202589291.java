import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int X = sc.nextInt();
		int list[] = new int[X-1];
		for (int i = 0; i < X-1; i++) {
			list[i] = sc.nextInt();
		}
		int ans[] = new int[X];
		for (int i = 0; i < X-1; i++) {
			ans[list[i]-1]++;
		}

		for (int i = 0; i < X; i++) {
			System.out.println(ans[i]);
		}

	}
}