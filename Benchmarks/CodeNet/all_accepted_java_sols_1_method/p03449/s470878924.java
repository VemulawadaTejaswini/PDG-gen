import java.util.Scanner;
import java.util.stream.Stream;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		try {
			int width = Integer.parseInt(scanner.nextLine());
			int height = 2;

			int[][] candyLines = new int[height][width];
			for (int x = 0; x < height; x++) {
				String[] tmp = scanner.nextLine().split(" ");
				int[] line = Stream.of(tmp).mapToInt(Integer::parseInt).toArray();
				for (int y = 0; y < width; y++) {
					candyLines[x][y] = line[y];
				}
			}

			int maxCandy = 0;
			for (int i = 0; i < width; i++) {
				int candy = 0;
				for (int l1 = 0; l1 <= i; l1++) {
					candy += candyLines[0][l1];
				}
				for (int l2 = i; l2 < width; l2++) {
					candy += candyLines[1][l2];
				}
				if (candy > maxCandy) {
					maxCandy = candy;
				}
			}
			System.out.print(maxCandy);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			scanner.close();
		}
	}
}
