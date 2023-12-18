import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		// 入力ミスは考慮しない

	    // 引数で標準入力System.inを指定する
	    Scanner scanner = new Scanner(System.in);

	    // 1行目を取得(a)
	    String input_text１ = scanner.nextLine();

	    int paramA = Integer.parseInt(input_text１);

	    int b = (paramA % 1000);

	    if (b == 0) {
	    	System.out.println(0);
	    	return;
	    }

	    System.out.println(1000 -  b);

	    // Scannerクラスのインスタンスをクローズ
	    scanner.close();
	}

}