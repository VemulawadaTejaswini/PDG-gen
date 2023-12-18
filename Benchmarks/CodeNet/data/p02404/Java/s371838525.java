import java.io.*;

class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		while (true) {
			String[] cut = br.readLine().split(" ");
			int H = Integer.parseInt(cut[0]);
			int W = Integer.parseInt(cut[1]);
			if (H == 0 && W == 0){
				break;
			}
			for (int i = 0; i < W; i++) {
				sb.append("#");

			}
			sb.append("\n");
			for (int k = 0; k < H-2; k++) {
				sb.append("#");
				for (int j = 0; j < W - 2; j++) {
					sb.append(".");
				}
				sb.append("#");
				sb.append("\n");
			}
			for (int i = 0; i < W; i++) {
				sb.append("#");
			}
			sb.append("\n");
			sb.append("\n");
		}
		System.out.print(sb);

	}

}