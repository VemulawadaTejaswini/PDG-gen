import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) {
		//
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		String[] inputStr = null;
		int[] inputInt = null;
		try {
			while(true) {
				inputStr = (input.readLine()).split("\\s");
				inputInt = new int[inputStr.length];
				for (int index = 0; index < inputInt.length; index++) {
					inputInt[index] = Integer.parseInt(inputStr[index]);
				}
				if(inputInt[0] == 0 && inputInt[1] == 0) {
					break;
				}
				for (int row = 0; row < inputInt[0]; row++) {
					for (int col = 0; col < inputInt[1]; col++) {
						if (row != 0 && row != (inputInt[0] -1) && col != 0 && col != (inputInt[1] -1)) {
							System.out.print(".");
						} else {
						    System.out.print("#");
						}
					}
					System.out.println();
				}
				System.out.println();
			}

		} catch (IOException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		}


	}

}

