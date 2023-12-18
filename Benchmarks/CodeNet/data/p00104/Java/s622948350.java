import java.util.Scanner;

public class Main {
	private Scanner sc;
	
	public static void main(String[] args) {
		new Main();
	}
	
	public Main() {
		sc = new Scanner(System.in);
		
		String lines = sc.nextLine();
		
		while (lines.equals("0 0")) {
			String[] xy = lines.split(" ");
		
			int[][] map = new int[Integer.parseInt(xy[0])][Integer.parseInt(xy[1])];
			
			for (int i = 0; i < xy.length; i++) {
				String line = sc.nextLine();
				
				for (int j = 0; j < xy[0].length(); j++) {
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
			while (true) {
				switch (map[y][x]) {
				case 0:
					System.out.println(x + " " + y);
					break;
				case 1:
					x++;
					break;
				case 2:
					x--;
					break;
				case 3:
					y++;
					break;
				case 4:
					y--;
					break;
				}
				
				if ((x == 0) && (y == 0)) {
					System.out.println("LOOP");
					break;
				}
			}
			
			lines = sc.nextLine();
		}
	}
}