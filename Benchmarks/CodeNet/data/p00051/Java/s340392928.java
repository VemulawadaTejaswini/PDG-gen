import java.util.Arrays;
import java.util.Scanner;

class Main {

	public static void main(String[] args) {
		Scanner sc = null;
		try {
			sc = new Scanner(System.in);
			while (sc.hasNextInt()) {
				int dataSetRows = sc.nextInt();
				for (int i = 0; i < dataSetRows; i++) {
					String originalNum = sc.next();
					char[] charNum = originalNum.toCharArray();

					// asc
					int minNum = Integer.parseInt(String.valueOf(asc(charNum)));

					// desc
					int maxNum = Integer.parseInt(String.valueOf(desc(charNum)));

					// max-min
					int result = maxNum - minNum;
					System.out.println(result);
				}
			}
		} finally {
			sc.close();
		}
	}

	private static char[] asc(char[] cArrays) {
		Arrays.sort(cArrays);
		return cArrays;
	}

	private static char[] desc(char[] cArrays) {
		char[] after = new char[cArrays.length];

		for (int i = 0; i < cArrays.length; i++) {
			after[i] = cArrays[cArrays.length - (1 + i)];
		}
		return after;
	}
}