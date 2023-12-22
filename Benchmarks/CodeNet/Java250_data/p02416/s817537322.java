import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String numStr;
		while (true) {
			numStr = sc.next();
			if (numStr.equals("0"))
				break;

			outSumOfNumbers(numStr);

		}

	}

	public static void outSumOfNumbers(String numStr) {
		byte[] sbyte = new byte[numStr.length()];
		int sum = 0;

		for (int i = 0; i < numStr.length(); i++) {
			sbyte[i] = (byte) numStr.charAt(i);
			sbyte[i] -= 48;
			sum += sbyte[i];
		}
		
		System.out.println(sum);
	}

}