import java.util.Scanner;

public class Main {

	static Main instance = new Main();

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		//入力値
		String str = scan.next();

		// 出力値
		int i = 0;
		if (str.equals("SUN")) {
			i = 7;
		} else if (str.equals("MON")) {
			i = 6;
		} else if (str.equals("TUE")) {
			i = 5;
		} else if (str.equals("WED")) {
			i = 4;
		} else if (str.equals("THU")) {
			i = 3;
		} else if (str.equals("FRI")) {
			i = 2;
		} else if (str.equals("SAT")) {
			i = 1;
		}

		System.out.println(i);
	}
}