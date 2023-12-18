import java.util.Scanner;

public class Main {

	@SuppressWarnings("resource")
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		String s = scanner.next();
		String[] str = s.split("");
		String tmp = "";

		for (int i = 0; i < Math.pow(2, s.length() - 1); i++) {
			for (int j = 0; j < s.length() - 1; j++) {
				tmp += str[j];
				if ((i >> j & 1) == 1) {
					tmp += ",";
				}
			}
			tmp += str[s.length() - 1];
			if (i != Math.pow(2, s.length() - 1) - 1) {
				tmp += ",";
			}
		}

		String[] target = tmp.split(",", 0);

		long sum = 0;
		for (int i = 0; i < target.length; i++) {
			sum += Long.parseLong(target[i]);
		}

		System.out.println(sum);

	}
}
