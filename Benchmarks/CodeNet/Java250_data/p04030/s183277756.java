import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		char[] inputs = scanner.nextLine().toCharArray();
		char[] outputs = new char[inputs.length];
		int oIndex = 0;
		for (int iIndex = 0; iIndex < inputs.length; iIndex++) {
			while (iIndex < inputs.length && inputs[iIndex] == 'B') {
				oIndex--;
				iIndex++;
			}
			if (iIndex >= inputs.length) break;
			if (oIndex < 0) oIndex = 0;
			outputs[oIndex++] = inputs[iIndex];
		}
		System.out.println(String.valueOf(Arrays.copyOf(outputs, oIndex)));
	}
}
