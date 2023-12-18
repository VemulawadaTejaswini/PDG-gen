import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		String output = "";
		String[] mozi = input.split(" ");
		String UpperAlpha = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String LowerAlpha = "abcdefghijklmnopqrstuvwxyz";
		int mozi_length = 0;

		int index1 = -1;
		int index2 = -1;
		for (int i = 0; i < mozi.length; i++) {
			mozi_length += mozi[i].length();
			if (i != 0) {
				output += " ";
			}
			for (int j = 0; j < mozi[i].length(); j++) {
				index1 = UpperAlpha.indexOf(mozi[i].charAt(j));
				index2 = LowerAlpha.indexOf(mozi[i].charAt(j));
				if (index1 == -1 && index2 == -1) {
					output += "" + mozi[i].charAt(j);
				} else if (index1 != -1) {
					output += "" + LowerAlpha.charAt(index1);

				} else if (index2 != -1) {
					output += "" + UpperAlpha.charAt(index2);
				}

			}
		}
		if (mozi_length < 1200) {
			System.out.println(output);
		}
	}

}

