package test;

public class SmallorLarge {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String inputStr = sc.nextLine();

		String[] inputStrArray = inputStr.split(" ");
		int[] inputIntArray = new int[inputStrArray.length];

		for (int index = 0; index < inputIntArray.length; index++) {
			inputIntArray[index] = Integer.parseInt(inputStrArray[index]);
		}

		String inequality = "";
		if (inputIntArray[0] < inputIntArray[1]) {
			inequality = " < ";
		}
		if (inputIntArray[0] > inputIntArray[1]) {
			inequality = " > ";
		}
		if (inputIntArray[0] == inputIntArray[1]) {
			inequality = " == ";
		}
		System.out.println(inputIntArray[0] + inequality + inputIntArray[1]);

	}

}

