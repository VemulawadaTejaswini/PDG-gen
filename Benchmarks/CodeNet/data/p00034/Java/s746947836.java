import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner sc = null;
		try {
			sc = new Scanner(System.in);
			int[] input = convertNum(sc.nextLine().split(","));

			int kukan[] = new int[10];
			int kukanSum = 0;
			for (int i = 0; i < 10; i++) {
				kukan[i] = input[i];
				kukanSum += kukan[i];
			}

			int v1 = input[input.length - 2];
			int v2 = input[input.length - 1];

			// 電車がすれ違うまでの距離を区間1から測る
			int pass = kukanSum / (v1 + v2) * v1;

			// すれ違う区間を出力する
			int passKukan = 0;
			int kukanNum = 0;
			for (int i = 0; i < kukan.length; i++) {
				passKukan += kukan[i];
				kukanNum++;
				if (passKukan > pass) {
					System.out.println(kukanNum);
					break;
				}
			}
		} finally {
			sc.close();
		}
	}

	private static int[] convertNum(String[] input) {
		int[] converted = new int[input.length];
		for (int i = 0; i < input.length; i++) {
			converted[i] = Integer.parseInt(input[i]);
		}
		return converted;
	}
}