import java.util.Scanner;

public class Main {
	private Scanner sc;
	
	public static void main(String[] args) {
		new Main();
	}
	
	public Main() {
		sc = new Scanner(System.in);
		
		int[][] map = new int[11][11];

		String line = "";
		for (int i = 0; i < 11; i++) {
			if ((i != 0) && (i != 10)) line = sc.nextLine();

			System.out.print(i + " : ");
			for (int j = 0; j < 11; j++) {
				if ((i == 0) || (j == 0) || (i == 10) || (j == 10)) {
					map[i][j] = 0;
					

					System.out.print(map[i][j]);
					continue;
				}
				
				if ((j % 2) != (i % 2)) map[i][j] = line.charAt((j - 1) / 2) - '0';
				else map[i][j] = 0;
				

				System.out.print(map[i][j]);
			}
			System.out.println();
		}
		
		int x = 2;
		int y = 0;
		int v = 1;
		
		while (true) {
			switch (v) {
			case 0:
				if (map[y][x + 1] == 1) {
					if (map[y - 1][x] == 0) {
						System.out.print("U");
						y = y - 2;
					} else {
						if (map[y][x - 1] == 0) {
							System.out.print("UL");
							v = 3;
						} else {
							System.out.print("ULD");
							v = 2;
						}
					}
				} else {
					v++;
					x = x + 2;
				}
				break;
				
			case 1:
				if (map[y + 1][x] == 1) {
					if (map[y][x + 1] == 0) {
						System.out.print("R");
						x = x + 2;
					} else {
						if (map[y - 1][x] == 0) {
							System.out.print("RU");
							v = 0;
						} else {
							System.out.print("RUL");
							v = 3;
						}
					}
				} else {
					v++;
					y = y + 2;
				}
				break;
				
			case 2:
				if (map[y][x - 1] == 1) {
					if (map[y + 1][x] == 0) {
						System.out.print("D");
						y = y + 2;
					} else {
						if (map[y][x + 1] == 0) {
							System.out.print("DR");
							v = 1;
						} else {
							System.out.print("DRU");
							v = 0;
						}
					}
				} else {
					v++;
					x = x - 2;
				}
				break;
				
			case 3:
				if (map[y - 1][x] == 1) {
					if (map[y][x - 1] == 0) {
						System.out.print("L");
						x = x - 2;
					} else {
						if (map[y + 1][x] == 0) {
							System.out.print("LD");
							v = 2;
						} else {
							System.out.print("LDR");
							v = 1;
						}
					}
				} else {
					v = 0;
					y = y - 2;
				}
				break;
			}
			if ((x == 2) && (y == 0)) break;
		}
	}
}