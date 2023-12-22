
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int max = 0;
		int nowsize = 0;
		int i = 1;
		int[][] map = new int[101][51];
		while (scanner.hasNext()) {

			StringTokenizer tokenizer = new StringTokenizer(scanner.nextLine(),
					",");
			int size = tokenizer.countTokens();
			for (int j = 1; tokenizer.hasMoreTokens(); j++) {
				if (nowsize < size) {
					map[i][j] = Math.max(map[i - 1][j - 1], map[i - 1][j])
							+ Integer.parseInt(tokenizer.nextToken());
				} else {
					map[i][j] = Math.max(map[i - 1][j], map[i - 1][j + 1])
							+ Integer.parseInt(tokenizer.nextToken());
				}
				max = Math.max(max, map[i][j]);
				
			}
			nowsize = size;
			i++;

		}
		System.out.println(max);

	}

}