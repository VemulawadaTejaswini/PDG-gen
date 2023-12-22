import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String str[] = br.readLine().split(" ");

		int h = Integer.parseInt(str[0]);
		int w = Integer.parseInt(str[1]);

		int n = Integer.parseInt(br.readLine());

		ArrayList<Integer> list = new ArrayList<>();

		str = br.readLine().split(" ");

		for (int i = 0; i < n; i++) {
			int a = Integer.parseInt(str[i]);
			for (int j = 0; j < a; j++) {
				list.add(i + 1);
			}
		}

		int dx = 1;

		int x = 0;
		int y = 0;

		int matrix[][] = new int[h][w];

		for (int i = 0; i < list.size(); i++) {
			matrix[y][x] = list.get(i);
			if (x + dx < 0) {
				dx = 1;
				y++;
			} else if (x + dx > w - 1) {
				dx = -1;
				y++;
			} else {
				x += dx;
			}
		}
		for (int i = 0; i < h; i++) {
			System.out.print(matrix[i][0]);
			for (int j = 1; j < w; j++) {
				System.out.print(" " + matrix[i][j]);
			}
			System.out.println();
		}
	}
}
