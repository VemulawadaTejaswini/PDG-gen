import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO ?????????????????????????????????????????????
		Scanner sc = new Scanner(System.in);
		String line1 = sc.nextLine();
		int n = Integer.parseInt(line1);

		String line2 = sc.nextLine();
		String[] cards = line2.split(" ");

		String[] suit = new String[n];
		for (int i = 0; i < n; i++) {
			suit[i] = cards[i].substring(0, 1);
		}

		int[] num = new int[n];
		for (int i = 0; i < n; i++) {
			num[i] = Integer.parseInt(cards[i].substring(1));
		}

		for (int i = 0; i < n - 1; i++) {
			for (int j = n - 1; j > i; j--) {
				if (num[j - 1] > num[j]) {
					int v = num[j];
					num[j] = num[j - 1];
					num[j - 1] = v;

					String w = suit[j];
					suit[j] = suit[j - 1];
					suit[j - 1] = w;
				}
			}
		}

		String[] suit2 = new String[n];
		for (int i = 0; i < n; i++) {
			suit2[i] = cards[i].substring(0, 1);
		}

		int[] num2 = new int[n];
		for (int i = 0; i < n; i++) {
			num2[i] = Integer.parseInt(cards[i].substring(1));
		}

		for (int i = 0; i < n - 1; i++) {
			int min = num2[i];
			int x = i;
			for (int j = i + 1; j < n; j++) {
				if (min > num2[j]) {
					min = num2[j];
					x = j;
				}
			}

			int v = num2[i];
			num2[i] = num2[x];
			num2[x] = v;

			String w = suit2[i];
			suit2[i] = suit2[x];
			suit2[x] = w;
		}

		StringBuilder str = new StringBuilder();

		for (int i = 0; i < n - 1; i++) {
			str.append(suit[i]);
			str.append(num[i]);
			str.append(" ");
		}
		str.append(suit[n - 1]);
		str.append(num[n - 1]);

		System.out.println(str);
		System.out.println("Stable");

		StringBuilder str2 = new StringBuilder();

		for (int i = 0; i < n - 1; i++) {
			str2.append(suit2[i]);
			str2.append(num2[i]);
			str2.append(" ");
		}
		str2.append(suit2[n - 1]);
		str2.append(num2[n - 1]);

		System.out.println(str2);

		int strCount = 0;

		for (int i = 0; i < n; i++) {
			if (suit[i].equals(suit2[i])) {
				strCount++;
			}
		}

		if (strCount == n) {
			System.out.println("Stable");
		} else {
			System.out.println("Not stable");
		}

	}

}