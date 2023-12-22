public class Main {

	public static void main(String[] args) {
		// TODO ?????????????????????????????????????????????
		java.util.Scanner sc = new java.util.Scanner(System.in);
		StringBuilder sb = new StringBuilder();

		while (true) {
			int h = sc.nextInt();
			int w = sc.nextInt();

			if (h == 0 && w == 0)
				break;

			for (int i = 1; i <= h; i++) {

				for (int j = 1; j <= w; j++) {

					if (i == 1 || i == h) {
						sb.append("#");
					} else {

						if (j == 1 || j == w) {
							sb.append("#");
						} else {
							sb.append(".");
						}

					}

				}
				sb.append("\n");

			}
			sb.append("\n");
		}

		System.out.print(sb);
	}
}