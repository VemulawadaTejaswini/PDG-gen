import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		int n = Integer.parseInt(str);

		//		int len = str.length();
		//		len = len / 2 + 1;
		int count = 0;

		int i = 1;
		while (i <= n) {
			if (String.valueOf(i).length() % 2 == 0) {
				i = i * 10;
				continue;
			}
			count++;
			i++;
		}

		//		for (int i = 0; i <= len; i++) {
		//			if (i % 2 != 0) {
		//				count++;
		//			}
		//			if (i >= n) {
		//				break;
		//			}
		//		}

		System.out.println(count);

		sc.close();
	}
}
