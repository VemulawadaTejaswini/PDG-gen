import java.util.Scanner;

public class Main {
	static int intN =0;
	static int sosuCnt =0;

	public static void main(String[] args) {
		//test
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		String result = "";
		if (Integer.parseInt(s) < 1200) {
			result = "ABC";
		} else if (Integer.parseInt(s) < 2800) {
			result = "ARC";
		} else {
			result = "AGC";
		}

		System.out.println(result);
	}

}
