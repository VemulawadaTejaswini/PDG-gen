import java.util.Scanner;

public class Main {

	static Main instance = new Main();

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		//入力値
		int numN = scan.nextInt();
		int numK = scan.nextInt();
		int numQ = scan.nextInt();

		int[] count = new int[numN];

		for (int i = 0;  i < numQ; i++) {
			int num = scan.nextInt() - 1;
			count[num] += 1;
		}

		for (int i = 0;  i < numN; i++) {
			String result = null;

			if (numK - (numQ - count[i]) > 0 ) {
				result = "Yes";
			} else {
				result = "No";
			}

			System.out.println(result);
		}
	}
}