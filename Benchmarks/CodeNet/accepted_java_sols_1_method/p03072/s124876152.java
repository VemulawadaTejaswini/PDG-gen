import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int[] a = new int[N];

		for (int i = 0; i < N; i++) {
			a[i] = sc.nextInt();
		}

		int cnt = 0;
		int min = a[0];
		for (int i = 1; i < a.length; i++) {
			if (min <= a[i]) {
				cnt++;
				min = a[i];
			}
		}

		System.out.println(cnt + 1);
	}

}