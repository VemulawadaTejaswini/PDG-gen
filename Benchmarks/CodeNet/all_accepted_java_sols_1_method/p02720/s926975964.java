import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int k = sc.nextInt();
		sc.close();

		int count = 0;
		long number = 1;
		while (true) {
			String text = String.valueOf(number);
			int target1 = Integer.parseInt(text.substring(0, 1));
			boolean check = true;
			for (int j = 1; j < text.length(); j++) {
				int target2 = Integer.parseInt(text.substring(j, j + 1));
				if (Math.abs(target2 - target1) > 1) {
					number += (long) Math.pow(10, text.length() - j - 1);
					check = false;
					break;
				}
				target1 = target2;
			}

			if (check) {
				if (++count == k) {
					break;
				}
				number++;
			}
		}

		System.out.println(number);
	}
}