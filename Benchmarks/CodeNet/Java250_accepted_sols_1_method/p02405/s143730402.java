import java.io.*;

class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		while (true) {
			String[] cut = br.readLine().split(" ");
			int H = Integer.parseInt(cut[0]);
			int W = Integer.parseInt(cut[1]);
			if (H == 0 && W == 0)
				break;

			for (int i = 0; i < H; i++) {

				if (i % 2 == 1) {
					for (int j = 0; j < W; j++) {
						if (j % 2 == 1) {
							sb.append("#");
						}
						if (j % 2 == 0) {
							sb.append(".");
						}
					}
					sb.append("\n");
				}

				if (i % 2 == 0) {
					for (int k = 0; k < W; k++) {
						if (k % 2 == 1) {
							sb.append(".");
						}
						if (k % 2 == 0) {
							sb.append("#");
						}
					}
					sb.append("\n");
				}

			}

			sb.append("\n");
		}

		System.out.print(sb);

	}
}