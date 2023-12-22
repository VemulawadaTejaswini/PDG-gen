import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String str = sc.next();
		int count = 0;
		for (int i = 0; i < n - 2; i++) {
			String tmp = "";
			for (int j = 0; j < 3; j++) {
				tmp += str.charAt(i + j);
			}
			if (tmp.equals("ABC")) {
				++count;
			}
		}
		System.out.println(count);
	}
}
