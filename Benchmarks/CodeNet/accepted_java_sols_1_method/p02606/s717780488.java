import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

	    // 引数で標準入力System.inを指定する
	    Scanner scanner = new Scanner(System.in);
		try {

		    // 1行目を取得(a)
//		    int input_text１ = scanner.nextInt();
			String[] line1Array = scanner.nextLine().split(" ");
			int pL = Integer.parseInt(line1Array[0]);
			int pR = Integer.parseInt(line1Array[1]);
			int pd = Integer.parseInt(line1Array[2]);

			int answer = 0;

			for (int i = pL; i <= pR; i++) {
				if (i %pd == 0) answer++;
			}

			System.out.printf("%d", answer);

		} finally {
		    // Scannerクラスのインスタンスをクローズ
		    scanner.close();
		}
	}
}