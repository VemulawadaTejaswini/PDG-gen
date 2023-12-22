import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		// 入力ミスは考慮しない

	    // 引数で標準入力System.inを指定する
	    Scanner scanner = new Scanner(System.in);
		try {

		    // 1行目を取得(a)
//		    int input_text１ = scanner.nextInt();
			String line = scanner.nextLine();
			int input_text１ = Integer.parseInt(line);

		    // AC, WA, TLE, RE
		    int[] countArray = {0, 0, 0, 0};

		    for (int i = 0; i < input_text１; i++) {

		    	String input_text = scanner.nextLine();

		    	if ("AC".equals(input_text)) {
		    		countArray[0]++;
		    	} else if ("WA".equals(input_text)) {
		    		countArray[1]++;
		    	} else if ("TLE".equals(input_text)) {
		    		countArray[2]++;
		    	} else if ("RE".equals(input_text)) {
		    		countArray[3]++;
		    	}
		    }

		    System.out.println("AC x " + countArray[0]);
		    System.out.println("WA x " + countArray[1]);
		    System.out.println("TLE x " + countArray[2]);
		    System.out.println("RE x " + countArray[3]);

		} finally {
		    // Scannerクラスのインスタンスをクローズ
		    scanner.close();
		}
	}

}
