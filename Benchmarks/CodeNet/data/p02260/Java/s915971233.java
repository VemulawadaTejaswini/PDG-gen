
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class SelectionSort {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int elementNum = Integer.parseInt(br.readLine());
		String line = br.readLine();
		int[] numArray = parseInt(getSplitLine(line));

		int i = numArray.length - 1;
		int count = 0;
		while (i > 0) {
			for (int j = i - 1; j >= 0; j--) {
				if (numArray[i] < numArray[j]) {
					int tmpNum = numArray[i];
					numArray[i] = numArray[j];
					numArray[j] = tmpNum;
					count++;
				}
			}
			i--;
		}
		System.out.println(Arrays.toString(numArray)
				.replaceAll("[\\[\\],]", ""));
		System.out.println(count);
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