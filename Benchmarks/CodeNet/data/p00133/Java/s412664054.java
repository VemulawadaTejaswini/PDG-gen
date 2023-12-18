
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int MAX = 8;
		char[][] map = new char[MAX][MAX];
		for (int i = 0; i < MAX; i++) {
			map[i] = scanner.next().toCharArray();
		}
		for (int n = 1; n < 4; n++) {
			char[][] tmp = new char[MAX][MAX];
			System.out.println(n * 90);
			for (int i = 0; i < MAX; i++) {
				for (int j = 0; j < MAX; j++) {
					tmp[i][j] = map[MAX - 1 - j][i];
					System.out.print(tmp[i][j]);
				}
				System.out.println();
			}
			map = tmp;
		}
	}
}