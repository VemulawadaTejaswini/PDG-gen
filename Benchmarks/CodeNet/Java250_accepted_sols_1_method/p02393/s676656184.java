import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String inputStr = sc.nextLine();

		String[] inputStrArray = inputStr.split(" ");
		int[] inputIntArray = new int[inputStrArray.length];

		try {
			for (int index = 0; index < inputIntArray.length; index++) {
				inputIntArray[index] = Integer.parseInt(inputStrArray[index]);
			}
			int tmp;

			for (int i = 0; i < inputIntArray.length; i++) {
				for (int j = 0; j < inputIntArray.length -1; j++) {
					if (inputIntArray[j] > inputIntArray[j +1]) {
						tmp = inputIntArray[j];
						inputIntArray[j] = inputIntArray[j +1];
						inputIntArray[j +1] = tmp;
					}
				}
			}
			boolean firstFlg = false;
			for (int i : inputIntArray) {
				if (firstFlg) {
					System.out.print(" ");
				}
				System.out.print(i);
				firstFlg = true;
			}
			System.out.println();

		} catch (NumberFormatException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		}

	}

}

