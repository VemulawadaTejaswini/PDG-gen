public class Main {

	public static void main(String[] args) {
		// TODO ?????????????????????????????????????????????
		java.util.Scanner sc = new java.util.Scanner(System.in);
		StringBuilder sb = new StringBuilder();

		while (true) {
			int h = sc.nextInt();
			int w = sc.nextInt();

			if ( h==0 && w==0 ) break;

			for (int i = 0; i < h; i++) {
				for (int j = 0; j < w; j++) {
					sb.append("#");
				}
				sb.append("\n");
			}
			sb.append("\n");
		}
		System.out.print(sb);
	}

}