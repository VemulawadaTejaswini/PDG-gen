import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int count;
		int sum;

		sum = 0;
		while (sc.hasNext()) {
			count = 0;
			String str = sc.next();
			for (int i = 0; i < str.length(); i++) {
				if ('0' <= str.charAt(i) && str.charAt(i) <= '9') {
					count *= 10;
					count += str.charAt(i) - '0';
				} else {
					sum += count;
					count = 0;
				}
			}
			sum += count;
		}
		System.out.println(sum);
	}
}