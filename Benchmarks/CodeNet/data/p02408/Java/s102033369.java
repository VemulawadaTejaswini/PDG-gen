import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		String rank = "SHCD";
		String[] input_data = new String[2];
		int[][] output_data = new int[4][13];
		Scanner sc = new Scanner(System.in);
		String input1 = sc.nextLine();
		int n = Integer.parseInt(input1);
		String input2 = "";
		int rank_number = 0;
		int card_number = 0;
		boolean judge = true;
		String output_rank = "";

		if (n > 0 && n <= 52) {

			out: for (int i = 0; i < n; i++) {
				input2 = sc.nextLine();
				input_data = input2.split(" ");
				rank_number = rank.indexOf(input_data[0]);
				card_number = Integer.parseInt(input_data[1]);
				if ((rank_number == -1)
						|| (1 > card_number || card_number > 13)) {
					judge = false;
					break out;
				}

				if (output_data[rank_number][card_number - 1] != card_number) {
					output_data[rank_number][card_number - 1] = card_number;
				}

			}

			//System.out.println();

			if (judge == true) {
				for (int j = 0; j < output_data.length; j++) {
					output_rank = "" + rank.charAt(j);
					for (int k = 0; k < output_data[0].length; k++) {
						if (output_data[j][k] != (k + 1)) {
							System.out.println(output_rank + " " + (k + 1));
						}

					}

				}
			}

		}

	}
}

