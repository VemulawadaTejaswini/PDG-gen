import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

	    // 引数で標準入力System.inを指定する
	    Scanner scanner = new Scanner(System.in);
		try {

		    // 1行目を取得(a)
//		    int input_text１ = scanner.nextInt();
			String line = scanner.nextLine();
			int input_text１ = Integer.parseInt(line);

			line = scanner.nextLine();
			String[] input_text2Array = line.split(" ");

			double[] arr = new double[input_text2Array.length];

			for (int i = 0; i < input_text2Array.length; i++) {
				arr[i] = Double.parseDouble(input_text2Array[i]);
			}

			Arrays.parallelSort(arr);

			double answer = 0;
			for (int i =  arr.length - 1; i > 0; i--) {
				answer = answer + arr[i];
			}

			System.out.printf("%.0f", answer);

		} finally {
		    // Scannerクラスのインスタンスをクローズ
		    scanner.close();
		}
	}


}