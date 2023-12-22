import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{
	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String[] mark = { "S", "H", "C", "D" };
		String[] allCard = new String[52];
		for (int x = 0; x < 4; x += 1) {
			for (int y = 0; y < 13; y += 1) {
				for (int z = 0; z < 52; z += 1) {
					allCard[13 * x + y] = (mark[x] + " " + Integer
							.toString(y + 1));
				}
			}
		}
		int n = Integer.parseInt(in.readLine());
		String[] myCard = new String[n];
		for (int i = 0; i < n; i += 1) {
			String[] inputMyCard = in.readLine().split(" ");
			String thisMark = inputMyCard[0];
			int num = Integer.parseInt(inputMyCard[1]);
			myCard[i] = thisMark + " " + Integer.toString(num);
		}
		Boolean[] existCard = new Boolean[52];
		for (int p = 0; p < n; p += 1) {
			for (int q = 0; q < 52; q += 1) {
				if (myCard[p].equals(allCard[q])) {
					existCard[q] = true;
				} else {
					continue;
				}
			}
		}
		for (int s = 0; s < 52; s += 1) {
			if (existCard[s] == null) {
				System.out.println(allCard[s]);
			}
		}
	}
}