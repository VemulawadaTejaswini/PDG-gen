import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int[] num = new int[3];
		num[0] = scan.nextInt();
		num[1] = scan.nextInt();
		num[2] = scan.nextInt();

		int count5 = 0;
		int count7 = 0;

		for (int number : num) {
			if (number == 5) {
				count5 += 1;
			} else if (number == 7) {
				count7 += 1;
			}
		}

		String result;

		if (count5 == 2 && count7 == 1) {
			result = "YES";
		} else {
			result = "NO";
		}
		System.out.println(result);
	}
}
