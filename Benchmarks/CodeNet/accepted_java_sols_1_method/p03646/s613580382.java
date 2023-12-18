import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		long k = sc.nextLong();
		sc.close();

		System.out.println(50);
		StringBuilder sb = new StringBuilder();
		long x = k / 50;
		long y = k % 50;
		for (int i = 0; i < 50; i++) {
			long v = i + x;
			if (i >= 50 - y) {
				v++;
			}
			sb.append(v).append(' ');
		}
		sb.deleteCharAt(sb.length() - 1);
		System.out.println(sb.toString());
	}
}
