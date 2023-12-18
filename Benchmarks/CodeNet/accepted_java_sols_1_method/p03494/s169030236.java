import java.util.Scanner;

public class Main {
	public static void main(String args[]) {


		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.next());

		int nums[] = new int[n];

//		Scanner sc2 = new Scanner(System.in);
		for (int i = 0; i < n; i++) {
			nums[i] = Integer.parseInt(sc.next());
		}
		int count = 0;

		while (true) {

			boolean flg = false;

			for (int i = 0; i < n; i++) {
				if (nums[i] % 2 == 0) {
					flg = true;
					nums[i] = nums[i]/2;
				} else {
					flg = false;
					break;
				}
			}

			if (flg) {
				count++;

				continue;
			} else {
				break;
			}
		}

		System.out.println(count);

	}
}
