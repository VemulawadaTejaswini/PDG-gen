import java.util.Scanner;

public class Main {

	public static void solve (String n) {

		double sum = 0;
		for (int i = 0; i < n.length(); i++) {
			String str = n.substring( i, i + 1);
			int num = Integer.parseInt(str);
			sum += num;
		}

		if (sum % 9 == 0) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}

	public static void main(String[] args) {

		long start = System.currentTimeMillis();
	    // 引数で標準入力System.inを指定する
	    Scanner scanner = new Scanner(System.in);
		try {

		    // 1行目を取得(a)
	    	String input_text = scanner.nextLine();

			solve(input_text);

		} finally {
		    // Scannerクラスのインスタンスをクローズ
		    scanner.close();
		}
		long end = System.currentTimeMillis();
		// System.out.println((end - start) );
	}


	// ************************************
	// Common
	// ************************************

	private static final int[] changeArrayStringToInt(String line) {

		String[] strArray = line.split(" ");

		int[] intArray = new int[strArray.length];

		for (int i = 0; i < intArray.length; i++) {
			intArray[i] = Integer.parseInt(strArray[i]);
		}
		return intArray;
	}

}
