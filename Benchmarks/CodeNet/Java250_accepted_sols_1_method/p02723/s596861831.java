import java.util.Scanner;

public class Main {

	static Main instance = new Main();

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		//入力値
		char[] str = scan.next().toCharArray();

		String result = "No";
		if (str[2] == str[3] && str[4] == str[5]) {
			result = "Yes";
		}

		System.out.println(result);
	}
}