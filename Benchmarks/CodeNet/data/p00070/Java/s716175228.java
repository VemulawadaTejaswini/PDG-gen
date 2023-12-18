import java.util.Scanner;

public class Main {
	private Scanner sc;

	int[][] map;
	public static void main(String[] args) {
		new Main();
	}
	
	public Main() {
		sc = new Scanner(System.in);
		
		int[][][] map = new int[11][(int)Math.pow(2, 10)][400];
		
		for (int i = 0; i < map.length; i++) {
			for (int j = 0; j < map[0].length; j++) {
				for (int k = 0; k < map[0][0].length; k++) {
					map[i][j][k] = 0;
				}
			}
		}
		map[0][0][0] = 1;
		
		for (int j = 1; j < map.length; j++) {
			for (int i = 0; i < map[0][0].length; i++) {
				for (int k = 0; k < 10; k++) {
					for (int bit = 0; bit < map[0].length; bit++) {	
						if ((i - j * k) >= 0) {
							if ((bit >> k) % 2 == 1) {
								map[j][bit][i] = map[j][bit][i] + map[j - 1][bit - (int)Math.pow(2, k)][i - j * k];
							}
						} else {
							break;
						}
					}
				}
			}
		}
		
		int[][] ans = new int[map.length][map[0][0].length];
		for (int i = 0; i < map.length; i++) {
			for (int k = 0; k < map[0][0].length; k++) {
				int sum = 0;
				
				for (int j = 0; j < map[0].length; j++) {
					sum = sum + map[i][j][k];
				}
				
				ans[i][k] = sum;
			}
		}
		
		while (sc.hasNextLine() == true) {
			String[] nico = sc.nextLine().split(" ");
			int n = Integer.parseInt(nico[0]);
			int s = Integer.parseInt(nico[1]);
			
			if (s >= 400) System.out.println("0");
			else System.out.println(ans[n][s]);
		}
	}
}