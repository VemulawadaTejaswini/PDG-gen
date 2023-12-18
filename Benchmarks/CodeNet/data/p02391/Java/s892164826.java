import java.util.Scanner;

public class Main{

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String inputStr = sc.nextLine();

		String[] inputStrArray = inputStr.split(" ");
		int[] inputIntArray = new int[inputStrArray.length];

		try {
			for (int index = 0; index < inputIntArray.length; index++) {
				inputIntArray[index] = Integer.parseInt(inputStrArray[index]);
			}

			String inequality = "";
			if (inputIntArray[0] < inputIntArray[1]) {
				inequality = " < ";
			} else if (inputIntArray[0] > inputIntArray[1]) {
				inequality = " > ";
			} else {
				inequality = " == ";
			}
			System.out.println("a" + inequality + "b");
		} catch (NumberFormatException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		}

	}

}

