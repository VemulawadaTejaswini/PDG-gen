import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = Integer.parseInt(sc.next());

		int len = Integer.toString(N).length();
		int oddNum = 0;
		int idx = 0;

		for (idx = len; idx > 0; idx--) {
			switch (idx) {
			case 5:
				if (idx == len) {
					oddNum += (N - 9999);
				} else {
					oddNum += 90000;
				}
				break;
			case 3:
				if (idx == len) {
					oddNum += (N - 99);
				} else {
					oddNum += 900;
				}
				break;
			case 1:
				if (idx == len) {
					oddNum += N;
				} else {
					oddNum += 9;
				}
				break;
			default:
				break;
			}
		}

		System.out.println(oddNum);

	}

}
