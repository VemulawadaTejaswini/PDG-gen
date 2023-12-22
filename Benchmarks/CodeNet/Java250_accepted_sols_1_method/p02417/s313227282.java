import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		// int MAX = 1000;
		Scanner sc = new Scanner(System.in);
		String input = "";
		String Alpha = "abcdefghijklmnopqrstuvwxyz ";
		int count_Empty = 0;
		int output[] = new int[26];
		int index = 0;
		String line = "";
		String each_mozi = "";
		int mozi_length = 0;

		do {
			input = sc.nextLine();
			line += input.toLowerCase();
		} while (sc.hasNext());

		for (int j = 0; j < line.length(); j++) {
			each_mozi = "" + line.charAt(j);
			index = Alpha.indexOf(each_mozi);
			if (index == 26) {
				count_Empty++;
			} else if (index != -1) {
				output[index]++;
			}

		}
		mozi_length += line.length() - count_Empty;

		if (mozi_length < 1200 && mozi_length != 0) {

			for (int k = 0; k < output.length; k++) {
				System.out.println("" + Alpha.charAt(k) + " : " + output[k]);

			}
		}

	}

}

