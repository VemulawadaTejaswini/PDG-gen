import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = br.readLine();
		int[] numArray = parseInt(getSplitLine(line));

		for (int j = 1; j < numArray.length; j++) {
			int key = numArray[j];
			int i = j - 1;
			while (i >= 0 && key < numArray[i]) {
				numArray[i + 1] = numArray[i];
				i--;
			}
			numArray[i + 1] = key;
		}

		System.out.println(Arrays.toString(numArray)
				.replaceAll("[\\[\\],]", ""));
	}

	private static String[] getSplitLine(String line) {
		return line.split("\\s");
	}

	private static int[] parseInt(String[] line) {
		int[] numArray = new int[line.length];
		for (int i = 0; i < line.length; i++) {
			numArray[i] = Integer.parseInt(line[i]);
		}
		return numArray;
	}
}