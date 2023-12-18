import java.util.Scanner;

public class ITP14D {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		int n = Integer.parseInt(input);
		String input2 = sc.nextLine();
		String[] data = input2.split(" ");
		int Min = Integer.parseInt(data[0]);
		int Max = Min;
		long Sum = Min;
		int value = 0;
		boolean judge = true;

		if ((n == data.length) && (n >= 0 && n <= 10000)) {

			out: for (int i = 1; i < data.length; i++) {
				value = Integer.parseInt(data[i]);
				if (value < -1000000 || value > 1000000) {
					judge = false;
					break out;
				}
				if (Max < value) {
					Max = value;
				}
				if (Min > value) {
					Min = value;
				}
				Sum += value;
			}

			if (judge == true) {
				System.out.println(Min + " " + Max + " " + Sum);
			}

		}

	}
}

