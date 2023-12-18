import java.util.*;

public class Main {

	/**
	 * @param args
	 */
	public static Scanner sc = new Scanner(System.in);
	
	int[][] map = new int[8][8];
	
	void blust(int x, int y) {
		map[x][y] = 0;
		int i = 1;
		while (x + i < 8 && i <= 3) {
			if (map[x+i][y] == 1)
				blust(x+i, y);
			i++;
		}
		
		i = 1;
		while (x - i >= 0 && i <= 3) {
			if (map[x-i][y] == 1)
				blust(x-i, y);
			i++;
		}
		
		i = 1;
		while (y + i < 8 && i <= 3) {
			if (map[x][y+i] == 1)
				blust(x, y+i);
			i++;
		}
		
		i = 1;
		while (y - i >= 0 && i <= 3) {
			if (map[x][y-i] == 1)
				blust(x, y-i);
			i++;
		}
	}
	
	void run() {
		int n , x, y;
		n = sc.nextInt();
		
		for (int k = 1; k <= n; k++) {
			for (int i = 0; i < 8; i++) {
				for (int j = 0; j < 8; j++) {
					map[j][i] = sc.nextInt();
				}
			}
			x = sc.nextInt();
			y = sc.nextInt();
			blust(x-1, y-1);
			
			System.out.printf("Data %d:\n", k);
			for (int i = 0; i < 8; i++) {
				for (int j = 0; j < 8; j++) {
					System.out.print(map[j][i]);
				}
				System.out.println();
			}
		}
		
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Main().run();
	}

}