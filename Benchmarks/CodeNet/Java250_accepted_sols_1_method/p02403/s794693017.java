import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

class Main {
	public static void main(String[] args) {
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		try {
			int H, W;
			ArrayList<int[]> list = new ArrayList<int[]>();
			do {
				int[] ret = new int[2];
				String[] input = br.readLine().split(" ");
				H = Integer.parseInt(input[0]);
				W = Integer.parseInt(input[1]);
				if (H == 0 && W == 0) {
					break;
				} else {
					ret[0] = H;
					ret[1] = W;
					list.add(ret);
				}
			} while (true);

			int x, y;
			for (int[] e : list) {
				H = e[0];
				W = e[1];
				for (x = 0; x < H; x++) {
					for (y = 0; y < W; y++) {
						System.out.print("#");
					}
					System.out.println();
				}
				System.out.println();
			}

		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}