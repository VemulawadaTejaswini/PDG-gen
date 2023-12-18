import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{

	public static void main(String[] args) throws IOException {
		// TODO 自動生成されたメソッド・スタブ
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		int inputInt;

		inputInt = Integer.parseInt(input.readLine());

		int x1, x2, x3;

		for (int i = 1; i <= inputInt; i++) {
			x1 = i / 10; // 10の位が3になる数値を判定
			x2 = i / 100; // 100の位が3になる数値を判定
			x3 = i / 1000; // 1000の位が3になる数値を判定

			if (i % 3 == 0 || i % 10 == 3 || x1 % 10 == 3 || x2 % 10 == 3 || x3 % 10 == 3) {

				System.out.print(" " + i);

			}
		}
		System.out.println();

	}

}

