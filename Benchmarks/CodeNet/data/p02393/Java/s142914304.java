import java.util.Arrays;
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
			boolean firstFlg = false;
			Arrays.sort(inputIntArray);
			for (int i : inputIntArray) {
				if(firstFlg) {
					  System.out.print(", ");
				}
				System.out.print(i);
				firstFlg = true;
			}



		} catch (NumberFormatException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		}

	}

}

