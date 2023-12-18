import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

	    // 引数で標準入力System.inを指定する
	    Scanner scanner = new Scanner(System.in);
		try {

		    // 1行目を取得(a)
			String[] line1Array = scanner.nextLine().split(" ");
			int num = Integer.parseInt(line1Array[0]);

			String[] line2Array = scanner.nextLine().split(" ");
			int[] blockArray = new int[line2Array.length];

			for (int i = 0; i < line2Array.length; i++) {
				blockArray[i] = Integer.parseInt(line2Array[i]);
			}

			int answer = 0;

			for (int i = 0; i < blockArray.length; i++) {
				if ((blockArray[i] % 2 == 1) && ((i + 1) %2 == 1)) {
					answer++;
				}
			}

			System.out.printf("%d", answer);

		} finally {
		    // Scannerクラスのインスタンスをクローズ
		    scanner.close();
		}
	}
}