import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		long start = System.currentTimeMillis();
	    // 引数で標準入力System.inを指定する
	    Scanner scanner = new Scanner(System.in);
		try {

		    // 1行目を取得(a)
			int n  = scanner.nextInt();
			scanner.nextLine();
			String x  = scanner.next();
			scanner.nextLine();

			for (int i = 0; i < n; i++) {
				int count = 0;
				long  val = createVal(x, i);
				long  div = countLetter (Long.toBinaryString(val), '1');
				if (div == 0) {
					System.out.println(count);
					continue;
				}
				while (true) {
					count++;
					val = popcount(val, div);
					if(val == 0) {
						break;
					}
					div = countLetter (Long.toBinaryString(val), '1');
				}
				System.out.println(count);
			}


		} finally {
		    // Scannerクラスのインスタンスをクローズ
		    scanner.close();
		}
		long end = System.currentTimeMillis();
		// System.out.println((end - start) );
	}


	private static long createVal(String x, int keta) {

//		String baseBy = Integer.toBinaryString(base);

		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < x.length(); i++) {
			if (i == keta) {
				if (x.charAt(i) == '0') {
					sb.append('1');
					continue;
				}
				sb.append('0');
				continue;
			}
			sb.append(x.charAt(i));
		}

		return Long.parseLong(sb.toString(), 2);
	}

	private static int countLetter(String value,  char target) {

		int count = 0;

		for (int i = 0; i < value.length(); i++) {
			if (value.charAt(i) == target) {
				count++;
			}
		}

		return count;
	}


	private static long popcount(long val, long div) {
		return val % div;
	}

	// ************************************
	// Common
	// ************************************

	private static final int[] changeArrayStringToInt(String[] strArray) {

		int[] intArray = new int[strArray.length];

		for (int i = 0; i < intArray.length; i++) {
			intArray[i] = Integer.parseInt(strArray[i]);
		}
		return intArray;
	}

}