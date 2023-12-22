import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int N = Integer.parseInt(br.readLine());
		int[][][] all = new int[4][3][10];

		for(int l = 0; l<N; l++){
			String[] set = br.readLine().split(" ");
			int b = Integer.parseInt(set[0]);
			int f = Integer.parseInt(set[1]);
			int r = Integer.parseInt(set[2]);
			int v = Integer.parseInt(set[3]);

			all[b-1][f-1][r-1] += v;
		}

		for(int i = 0; i < all.length; i++){
			for(int j = 0; j < all[i].length; j++) {
				for(int k = 0; k < all[i][j].length; k++) {
					sb.append(" ").append(all[i][j][k]);
				}
				sb.append("\n");
			}
			if (i != all[i].length) {
				sb.append("####################\n");
			}
		}
		System.out.print(sb);
	}

}