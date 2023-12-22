import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String w = sc.nextLine();

		int result = 0;
		while (true) {
			String t1 = sc.nextLine();
			if ("END_OF_TEXT".equals(t1)) {
				break;
			}
			t1 = t1.toLowerCase();

			String[] arr = t1.split(" ");

			for (int i = 0; i < arr.length; i++) {
				if (w.equals(arr[i])) {
					result++;
				}
			}

		}
		System.out.println(result);

		sc.close();

	}
}
