import java.util.Scanner;

public class Main {
	private Scanner sc;
	
	public static void main(String[] args) {
		new Main();
	}
	
	public Main() {
		sc = new Scanner(System.in);
		
		String lines = sc.nextLine();
		
		while (lines.equals("0 0") == false) {
			String[] xy = lines.split(" ");
			
			int[][] map = new int[Integer.parseInt(xy[0])][Integer.parseInt(xy[1])];

			for (int i = 0; i < map.length; i++) {
				String line = sc.nextLine();

				for (int j = 0; j < map[0].length; j++) {
					switch (line.charAt(j)) {
					case '>':
						map[i][j] = 1;
						break;
					case '<':
						map[i][j] = 2;
						break;
					case 'v':
						map[i][j] = 3;
						break;
					case '^':
						map[i][j] = 4;
						break;
					case '.':
						map[i][j] = 0;
						break;
					}
				}
			}
			
			int x = 0;
			int y = 0;
			
			boolean goal = false;
			while (goal == false) {
				int nx = x;
				int ny = y;
				
				switch (map[y][x]) {
				case 0:
					System.out.println(x + " " + y);
					goal = true;
					break;
				case 1:
					nx++;
					break;
				case 2:
					nx--;
					break;
				case 3:
					ny++;
					break;
				case 4:
					ny--;
					break;
				}
				
				map[y][x] = 5;
				x = nx;
				y = ny;
				
				if ((map[y][x] == 5) && (goal == false)) {
					System.out.println("LOOP");
					break;
				}
			}
			
			lines = sc.nextLine();
		}
	}
}