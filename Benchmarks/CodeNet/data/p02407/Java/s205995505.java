import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		String input1 = sc.nextLine();
		int n = Integer.parseInt(input1);
		String input2 = sc.nextLine();
		String[] data = input2.split(" ");
		String output = "";
		int value = 0;
		boolean judge = true;

		out: for (int i = data.length - 1; i >= 0; i--) {
			value = Integer.parseInt(data[i]);
			if (value < 0 || value > 1000) {
				judge = false;
				break out;
			}
			if (i == data.length - 1) {
				output += "" + value;
			} else {
				output += " " + value;
			}
		}

		if ((n > 0 && n <= 1000) && (data.length == n) && (judge == true)) {

			System.out.println(output);

		}

	}

}

