import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int iRes = 0;

		String str = sc.nextLine();
		String[] strArray = str.split("");

		for(String s : strArray) {
			if (s.equals("1")) {
				iRes++;
			}
		}
		System.out.println(iRes);

	    // Scannerクラスのインスタンスをクローズ
		sc.close();
	}
}
