import java.util.Scanner;
import java.util.stream.Stream;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] line = Stream.of(sc.nextLine().split(" ", 0)).mapToInt(Integer::parseInt).toArray();
		char[][] map = new char[line[0]][line[1]];

		for (int i = 0; i < line[0]; i++) {
			map[i] = sc.nextLine().toCharArray();
		}
		int con = 0;
		int ans = 0;
		for (int i = 0; i < (1 << line[0]); i++) {
			for (int j = 0; j < (1 << line[1]); j++) {
				con = 0;
				for (int k = 0; k < line[0]; k++) {
					for (int l = 0; l < line[1]; l++) {
						if (map[k][l] == '#' && (((i >> k) & 1) != 1) && (((j >> l) & 1) != 1)) {
							con++;
						}
					}
				}
				if (con == line[2]) {
					ans++;
				}
			}
		}
		System.out.println(ans);
	}
}
