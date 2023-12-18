import java.util.Scanner;

public class Main {
	private Scanner sc;
	
	public static void main(String[] args) {
		new Main();
	}
	
	public Main() {
		sc = new Scanner(System.in);
		
		int[][] map = new int[10][10];
		int[][][] drop = {
				{
					{0, 0, 0, 0, 0},
					{0, 0, 1, 0, 0},
					{0, 1, 1, 1, 0},
					{0, 0, 1, 0, 0},
					{0, 0, 0, 0, 0}
				},
				{
					{0, 0, 0, 0, 0},
					{0, 1, 1, 1, 0},
					{0, 1, 1, 1, 0},
					{0, 1, 1, 1, 0},
					{0, 0, 0, 0, 0}
				},
				{
					{0, 0, 1, 0, 0},
					{0, 1, 1, 1, 0},
					{1, 1, 1, 1, 1},
					{0, 1, 1, 1, 0},
					{0, 0, 1, 0, 0}
				}
		};
		
		while (sc.hasNextLine() == true) {
			String[] params = sc.nextLine().split(",");
			int x = Integer.parseInt(params[0]);
			int y = Integer.parseInt(params[1]);
			int d = Integer.parseInt(params[2]) - 1;
			
			for (int i = 0; i < 5; i++) {
				int xi = x + i - 2;
				if ((xi < 0) || (xi >= 10)) continue;
				
				for (int j = 0; j < 5; j++) {
					int yj = y + j - 2;
					if ((yj < 0) || (yj >= 10)) continue;
					
					map[xi][yj] = map[xi][yj] + drop[d][i][j];
				}
			}
		}

		int count = 0;
		int max = 0;
		for (int i = 0; i < map.length; i++) {
			for (int j = 0; j < map[0].length; j++) {
				if (map[i][j] == 0) count++;
				if (max < map[i][j]) max = map[i][j];
			}
		}
		System.out.println(count);
		System.out.println(max);
	}
}