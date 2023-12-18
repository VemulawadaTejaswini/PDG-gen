import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int sum = 0;
		int max = 0;
		int[] p = new int[N];
		for (int i = 0; i < N; i++) {
			p[i] = sc.nextInt();
			sum += p[i];
			max = Math.max(max, p[i]);
		}

		sum -= max / 2;

		System.out.println(sum);
	}
}