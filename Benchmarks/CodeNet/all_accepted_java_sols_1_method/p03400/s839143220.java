import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int D = sc.nextInt();
		int X = sc.nextInt();
		int[] list = new int[N];
		for (int i = 0; i < N; i++) {
			list[i] = sc.nextInt();
		}
		int sum = 0;

		for (int i = 0; i < N; i++) {
			int eat = 1;
			int cnt = 1;
			while (eat <= D) {
				sum++;
				eat = 1 + cnt * list[i];
				cnt++;
			}
		}
		System.out.println(sum + X);
	}
}