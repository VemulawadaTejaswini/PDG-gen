import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		// 入力
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();

		int[] list = new int[N];
		for (int i = 0; i < N; i++) {
			list[i] = sc.nextInt();
		}
		sc.close();

		int ans = 0;
		int MaxHeight = 1;
		// 今見ている山
		for (int i = 0; i < N; i++) {
			if(MaxHeight <=  list[i]) {
				ans++;
				MaxHeight = list[i];
			}
		}
		System.out.println(ans);

	}
}