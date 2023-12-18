import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int[] x = new int[10];
		for (int i = 1; i <= 5; ++i) {
			x[i] = sc.nextInt();
		}

		for (int i = 1; i <= 5; ++i) {
			if (x[i] == i) {
				continue;
			}

			System.out.println(i);
			return;
		}
	}

}
