import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			final int LEN = 6;
			String in = sc.next();
			int count = 0;
			for (int i = 0; i < LEN; i++) {
				if ("1".equals(in.substring(i, i + 1))) {
					count++;
				}
			}
			// 出力
			System.out.println(count);
		}
	}
}
