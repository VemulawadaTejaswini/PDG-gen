import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int MAX_DATA = 1000;
		int data_count = 0;
		String input = "";
		int output[] = new int[MAX_DATA];
		boolean judge = true;

		out: for (int i = 0; i < MAX_DATA; i++) {
			input = sc.nextLine();
			if (input.equals("0")) {
				break out;
			}
			if (input.length() > 1000 || input.length() == 0) {
				judge = false;
			}
			for (int j = 0; j < input.length(); j++) {
				output[i] += Integer.parseInt("" + input.charAt(j));

			}
			data_count++;
		}

		if (judge == true) {
			for (int k = 0; k < data_count; k++) {
				System.out.println(output[k]);

			}
		}
	}

}

