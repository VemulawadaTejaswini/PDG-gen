import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		String output = "";
		String[] mozi = input.split("");
		String UpperAlpha = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String LowerAlpha = "abcdefghijklmnopqrstuvwxyz";

		int index1 = -1;
		int index2 = -1;
		if (mozi.length - 1 < 1200) {
			for (int i = 1; i < mozi.length; i++) {
				index1 = UpperAlpha.indexOf(mozi[i]);
				index2 = LowerAlpha.indexOf(mozi[i]);
				if (index1 == -1 && index2 == -1) {
					output += mozi[i];
				} else if (index1 != -1) {
					output += "" + LowerAlpha.charAt(index1);

				} else if (index2 != -1) {
					output += "" + UpperAlpha.charAt(index2);
				}
			}

			System.out.println(output);
		}
	}
}

