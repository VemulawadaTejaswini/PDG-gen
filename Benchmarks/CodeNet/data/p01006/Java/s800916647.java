import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String args[] ) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = br.readLine();
		String output = "";
		List<String> input = new ArrayList<String>();
		for(int i = 1; i < 1000; i++) {
			// CTRL+Z??§??\????????????
			input.add(line);

			line = br.readLine();
		}
		boolean isFirstLine = true;
		for (String inputLine : input) {
			if (!isFirstLine) {
				System.out.println();
			}

			List<Character> stringArray = new ArrayList<Character>();
			for (int i = 0; i < inputLine.length(); i++) {
				stringArray.add(inputLine.charAt(i));
			}

			int preNumber = 0;
			int currentNumber = 0;
			boolean isSuccess = true;
			for (Character c : stringArray) {
				currentNumber = stringToNumber(c);
				if (preNumber == 0) {
					preNumber = currentNumber;
				} else {
				    if (Math.abs(currentNumber - preNumber) == 3 || Math.abs(currentNumber - preNumber) == 1) {
				    	isSuccess = false;
				    }
				}
				if (!isSuccess) {
					break;
				}
			}
			if (isSuccess) {
				System.out.print(inputLine);
			}

		}

    }
	private static int stringToNumber(Character s) {
		if (s.equals("A")) {
			return 1;
		} else if (s.equals("B")) {
			return 2;
		} else if (s.equals("B")) {
			return 3;
		} else if (s.equals("D")) {
			return 4;
		} else if (s.equals("E")) {
			return 5;
		} else if (s.equals("F")) {
			return 6;
		} else if (s.equals("G")) {
			return 7;
		} else if (s.equals("H")) {
			return 8;
		} else if (s.equals("I")) {
			return 9;
		}
		return 99;
	}

}