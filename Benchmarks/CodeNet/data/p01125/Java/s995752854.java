import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		while (true) {
			int N = s.nextInt();

			if (N == 0)
				break;

			int[][] graph = new int[21][21];

			for (int i = 0; i < N; i++) {
				int x = s.nextInt();
				int y = s.nextInt();
				graph[x][y] = 1;
			}

			int M = s.nextInt();
			int robox = 10, roboy = 10;

			for (int j = 0; j < M; j++) {
				String d = s.next();
				int l = s.nextInt();

				graph[roboy][robox] = 0;

				switch (d) {
				case "N":
					for (int t = 0; t <= l; t++) {
						graph[roboy][robox + t] = 0;
					}
					robox = robox + l;
					break;

				case "E":
					for (int t = 0; t <= l; t++) {
						graph[roboy + t][robox] = 0;
					}
					roboy = roboy + l;
					break;

				case "W":
					for (int t = 0; t <= l; t++) {
						graph[roboy - t][robox] = 0;
					}
					roboy = roboy - l;
					break;

				case "S":
					for (int t = 0; t <= l; t++) {
						graph[roboy][robox - t] = 0;
					}
					robox = robox - l;
					break;
				}
			}

			int ans = 0;

			for (int p = 0; p < 21; p++) {
				for (int q = 0; q < 21; q++) {
					ans += graph[p][q];
				}
			}

			if (ans == 0)
				System.out.println("Yes");
			else
				System.out.println("No");

		}
	}
}