import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int[][][] houses = new int[4][3][10];
		int n = Integer.parseInt(in.readLine());
		for (int i = 0; i < n; i += 1) {
			String[] info = in.readLine().split(" ");
			int b = Integer.parseInt(info[0]);
			int f = Integer.parseInt(info[1]);
			int r = Integer.parseInt(info[2]);
			int v = Integer.parseInt(info[3]);
			houses[b - 1][f - 1][r - 1] += v;
		}
		for (int x = 0; x < 4; x += 1) {
			for (int y = 0; y < 3; y += 1) {
				for (int z = 0; z < 10; z += 1) {
					sb.append(" ");
					sb.append(Integer.toString(houses[x][y][z]));
				}
				sb.append(System.getProperty("line.separator"));
			}
			if (x != 3) {
				sb.append("####################"
						+ System.getProperty("line.separator"));
			}
		}
		System.out.print(sb);
	}
}