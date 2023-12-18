public class Main {

	public static void main(String[] args) {
		// TODO ?????????????????????????????????????????????
		java.util.Scanner sc = new java.util.Scanner(System.in);
		StringBuilder sb = new StringBuilder();

		int n = sc.nextInt();

		loop:
		for (int i = 1; i <= n; i++) {
			int x = i;

			if (x % 3 == 0) {
				sb.append(" " + i);
				continue loop;
			}

			do {
				if (x % 10 == 3) {
					sb.append(" " + i);
					continue loop;
				}
				x /= 10;
			} while (x != 0);
		}

		System.out.println(sb);
	}

}