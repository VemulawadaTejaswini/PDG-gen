import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int t = 1;
		int y = 1;
		int[][] ty = new int[10000][2];
		int count = 0;

		// tとyが0になるまで回して、二次元配列tyを埋める　一回作業するごとにcountが1増える
		for (int i = 0; t != 0 || y != 0; i++) {

			String line = sc.nextLine();
			String[] HW = line.split(" ");
			t = Integer.parseInt(HW[0]);
			y = Integer.parseInt(HW[1]);
			ty[i][0] = t;
			ty[i][1] = y;

			count++;

		}

		// tyとint変数countを使って＃で作った四角形を出力する
		for (int i = 0; i < count-1; i++) {

			StringBuilder x = new StringBuilder();
			for (int j = 0; j < ty[i][1]; j++) {

				x.append("#");

			}

			String z = x.toString();

			for (int j = 0; j < ty[i][0]; j++) {

				System.out.println(z);

			}
			System.out.println("");

		}

	}

}

