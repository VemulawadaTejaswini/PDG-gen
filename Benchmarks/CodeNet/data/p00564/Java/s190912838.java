import java.util.*;

class Main {

	private static final String SPLIT_STR = " ";

	public static void main(String[] args) {

		String input = null;

		Scanner sc = new Scanner(System.in);

		input = sc.nextLine();
		String[] split = input.split(SPLIT_STR);
		int total = Integer.parseInt(split[0]);
		int num1 = Integer.parseInt(split[1]);
		int yen1 = Integer.parseInt(split[2]);
		int num2 = Integer.parseInt(split[3]);
		int yen2 = Integer.parseInt(split[4]);

		sc.close();

		int cnt = 0;
		int result = 0;

		int total1 = 0;
		while (total1 < total) {
			total1 += num1;
			cnt++;
		}
		result = cnt * yen1;

		cnt = 0;
		int total2 = 0;
		while (total2 < total) {
			total2 += num2;
			cnt++;
		}
		result = (cnt * yen2 < result) ? cnt * yen2 : result;

		System.out.println(result);
	}
}

