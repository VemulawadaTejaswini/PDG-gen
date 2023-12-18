import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		int wordMaxLength = 0;
		int wordMaxFrequency = 0;

		String list[] = sc.nextLine().split(" ");
		int listLength = list.length;
		int count[] = new int[listLength];

		for (int i = 0; i < listLength; i++) {
			if (wordMaxLength < list[i].length()) {
				wordMaxLength = i;
			}

			for (int j = i + 1; j < listLength; j++) {
				if (list[i].equals(list[j])) {
					count[i] += 1;
				}

			}

		}

		for (int i = 0; i < count.length; i++) {
			if (wordMaxFrequency < count[i]) {
				wordMaxFrequency = i;
			}
		}
		System.out.println(list[wordMaxFrequency] + " " + list[wordMaxLength]);

	}

}