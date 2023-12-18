import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws Exception {
		int[] unsortArray = initArray();
		//int[] unsortArray = new int[]{5,2,4,6,1,3};
		sort(unsortArray);
	}

	private static void sort(int[] unsortArray) {
		int sortedIndex = 0;
		for (int i=0; i < unsortArray.length; i++) {
			int newValue = unsortArray[i];
			int checkIdx = i;
			for (int j=0; j <= sortedIndex; j++) {
				int sortedValue = unsortArray[j];
				if (newValue < sortedValue) {
					while(checkIdx > j) {
						unsortArray[checkIdx] = unsortArray[checkIdx-1];
						checkIdx--;
					}
					unsortArray[j] = newValue;
					break;
				}
			}
			sortedIndex = i;
			dumpArray(unsortArray);
		}

	}

	private static void dumpArray(int[] array) {
		StringBuilder builder = new StringBuilder();
		for(int i=0; i<array.length; i++) {
			if (i != 0) {
				builder.append(" ");
			}
			builder.append(array[i]);
		}
		System.out.println(builder.toString());
	}
	private static int[] initArray() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String numStr = br.readLine();
		int arrayNum = Integer.parseInt(numStr);
		if (arrayNum < 0 || arrayNum > 100) {
			throw new IllegalArgumentException("0 <= num <= 100");
		}
		String arrayStr = br.readLine();
		String[] values = arrayStr.split(" ");

		int[] unsortArray = new int[arrayNum];

		if (values.length !=  arrayNum) {
			throw new IllegalArgumentException("input line is illegal");
		}

		for (int i=0; i< arrayNum; i++) {
			int value = Integer.parseInt(values[i]);
			validateValue(value);
			unsortArray[i] = value;
		}
		return unsortArray;
	}
	private static void validateValue(int value) {
		if (value < 0 || value > 1000) {
			throw new IllegalArgumentException("value is invalid");
		}
	}
}
