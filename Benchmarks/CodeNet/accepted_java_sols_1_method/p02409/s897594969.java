import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {

	public static void main(String[] args) {
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		try {
			String input = br.readLine();
			int num = Integer.parseInt(input);
			int i, b, r, f, v;
			int[][][] hoge = new int[4][3][10];
			for (i = 0; i < num; i++) {
				String[] list = br.readLine().split(" ");
				b = Integer.parseInt(list[0]) - 1;
				r = Integer.parseInt(list[1]) - 1;
				f = Integer.parseInt(list[2]) - 1;
				v = Integer.parseInt(list[3]);

				int temp = hoge[b][r][f] + v;
				if (temp > 9) {
					temp = 9;
				} else if (temp < 0) {
					temp = 0;
				}
				hoge[b][r][f] = temp;
			}

			int x, y, z;
			for (x = 0; x < hoge.length; x++) {
				int[][] xlist = hoge[x];
				for (y = 0; y < xlist.length; y++) {
					int[] ylist = xlist[y];
					for (z = 0; z < ylist.length; z++) {
						System.out.print(" " + ylist[z]);
					}
					if (y != ylist.length - 1) {
						System.out.println();
					}
				}
				if (x != hoge.length - 1) {
					System.out.println("####################");
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}