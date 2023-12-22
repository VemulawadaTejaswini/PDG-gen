import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int T = sc.nextInt();
		int[] c = new int[N];
		int[] t = new int[N];

		for (int i = 0; i < N; i++) {
			c[i] = sc.nextInt();
			t[i] = sc.nextInt();
		}


		int min = c[0];
		int index = -1;

		for (int i = 0; i < N; i++) {
			if (t[i] > T)
				continue;
			if (c[i] <= min) {
				min = c[i];
				index = i;
			}
		}

		if (index == -1)
			System.out.println("TLE");
		else
			System.out.println(min);

	}

}
