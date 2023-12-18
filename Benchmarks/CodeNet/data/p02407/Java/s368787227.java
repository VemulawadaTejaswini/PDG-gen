import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		//
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		String[] inputStr = new String[Integer.parseInt((input.readLine()))];
		inputStr = (input.readLine()).split("\\s");
		int[] inputInt = new int[inputStr.length];

		for (int i = 0; i < inputInt.length; i++) {
			inputInt[i] = Integer.parseInt(inputStr[i]);
		}

/*		int tmp;
		for (int i = 0; i < inputInt.length; i++) {
			for (int j = 0; j < inputInt.length -1; j++) {
				if (inputInt[j] <= inputInt[j +1]) {
					tmp = inputInt[j];
					inputInt[j] = inputInt[j +1];
					inputInt[j +1] = tmp;
				}
			}
		}
*/		for (int i = inputInt.length -1; i >= 0; i--) {
			System.out.print(inputInt[i]);
			if (i != 0) {
			  System.out.print(" ");
			}
		}
		System.out.println();
	}

}

