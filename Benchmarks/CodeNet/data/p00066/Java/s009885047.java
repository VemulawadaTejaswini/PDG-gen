import java.util.Scanner;

public class Main {
	private Scanner sc;
	
	public static void main(String[] args) {
		new Main();
	}
	
	public Main() {
		sc = new Scanner(System.in);
		
		while (sc.hasNextLine() == true) {
			String line = sc.nextLine();

			int[][] map = new int[3][3];
			for (int i = 0; i < map.length; i++) {
				for (int j = 0; j < map.length; j++) {
					switch (line.charAt(i * 3 + j)) {
					case 'o':
						map[i][j] = 0;
						break;
					case 'x':
						map[i][j] = 1;
						break;
					case 's':
						map[i][j] = -1;
						break;
					}
				}
			}
			
			char[] sides = new char[2];
			sides[0] = 'o';
			sides[1] = 'x';

			char ans = 'd';
			for (int i = 0; i < map.length; i++) {
				if ((map[0][i] == map[1][i]) && (map[1][i] == map[2][i]) && (map[0][i] != -1)) {
					ans = sides[map[0][i]];
					break;
				}
			}
			for (int i = 0; i < map.length; i++) {
				if ((map[i][0] == map[i][1]) && (map[i][1] == map[i][2]) && (map[i][0] != -1)) {
					ans = sides[map[i][0]];
					break;
				}
			}
			
			if ((map[0][0] == map[1][1]) && (map[1][1] == map[2][2]) && (map[1][1] != -1)) ans = sides[map[1][1]];
			if ((map[0][2] == map[1][1]) && (map[1][1] == map[2][0]) && (map[1][1] != -1)) ans = sides[map[1][1]];
			
			System.out.println(ans);
		}
	}
}