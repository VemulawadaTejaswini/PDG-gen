import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {
	public static void main(String[] args) {
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		try {
			String[] inputList = br.readLine().split(" ");
			int H = Integer.parseInt(inputList[0]);
			int W = Integer.parseInt(inputList[1]);
			int[][] a = new int[H][W];
			int[] b = new int[H];
			int i, x;
			for (i = 0; i < H; i++) {
				inputList = br.readLine().split(" ");
				for (x = 0; x < inputList.length; x++) {
					a[i][x] = Integer.parseInt(inputList[x]);
				}
			}
			for (i = 0; i < W; i++) {
				int input = Integer.parseInt(br.readLine());
				for (x = 0; x < H; x++) {
					b[x] = b[x] + a[x][i] * input;
				}
			}

			for (i = 0; i < H; i++) {
				System.out.println(b[i]);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}