import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			int[][] map = new int[3][3];
			for (int i = 0; i < 3; i++) {
				for (int j = 0; j< 3; j++) {
					map[i][j] = scanner.nextInt();
				}
			}

			int temp2 = map[0][1] - map[0][0];
			int temp3 = map[0][2] - map[0][0];

			if (map[1][1] - map[1][0] == temp2 && map[2][1] - map[2][0] == temp2 && map[1][2] - map[1][0] == temp3 && map[2][2] - map[2][0] == temp3) {
				System.out.println("Yes");
			} else {
				System.out.println("No");
			}
		}
	}
}
