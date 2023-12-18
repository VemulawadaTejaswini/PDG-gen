import java.util.Scanner;

public class Main {
	static int height;
	static int width;
	static char unit[][];
	static char command[];

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scanner = new Scanner(System.in);
		// データセット数
		int count = Integer.parseInt(scanner.nextLine());
		for (int i = 0; i < count; i++) {
			// 高さと幅の入力
			height = scanner.nextInt();
			width = scanner.nextInt();
			String space = scanner.nextLine();

			// マップを配列unitに格納
			unit = new char[height][width];
			for (int line = 0; line < height; line++) {
				String unitline = scanner.nextLine();
				for (int calum = 0; calum < width; calum++) {
					unit[line][calum] = unitline.charAt(calum);
				}
			}
			// 操作列の長さと操作列
			int ordernum = scanner.nextInt();
			String space2 = scanner.nextLine();
			String order = scanner.nextLine();
			command = new char[ordernum];
			// 操作列を配列commandに格納
			for (int index = 0; index < ordernum; index++) {
				command[index] = order.charAt(index);
			}

			for (int index = 0; index < ordernum; index++) {
				flag: for (int line = 0; line < height; line++) {
					for (int calum = 0; calum < width; calum++) {
						if (unit[line][calum] == '^' || unit[line][calum] == '<' ||
								unit[line][calum] == '>' || unit[line][calum] == 'v') {

							switch (command[index]) {
							case 'U':
								if (line == 0) {
									unit[line][calum] = '^';
								} else if (line != 0 && unit[line - 1][calum] == '.') {
									unit[line - 1][calum] = '^';
									unit[line][calum] = '.';
								} else {
									unit[line][calum] = '^';
								}
								break;
							case 'D':
								if (line == height - 1) {
									unit[line][calum] = 'v';
								} else if (line != height - 1
										&& unit[line + 1][calum] == '.') {
									unit[line + 1][calum] = 'v';
									unit[line][calum] = '.';
								} else {
									unit[line][calum] = 'v';
								}
								break;
							case 'L':
								if (calum == 0) {
									unit[line][calum] = '<';
								} else if (calum != 0 && unit[line][calum - 1] == '.') {
									unit[line][calum - 1] = '<';
									unit[line][calum] = '.';
								} else {
									unit[line][calum] = '<';
								}
								break;
							case 'R':
								if (calum == width - 1) {
									unit[line][calum] = '>';
								} else if (calum != width - 1
										&& unit[line][calum + 1] == '.') {
									unit[line][calum + 1] = '>';
									unit[line][calum] = '.';
								} else {
									unit[line][calum] = '>';
								}
								break;
							case 'S':
								fire(line, calum);
								break;
							default:
								break;
							}

							break flag;
						}
					}
				}
			}

			for (int line = 0; line < height; line++) {
				for (int calum = 0; calum < width; calum++) {
					if (calum == width - 1) {
						System.out.println(unit[line][calum]);
					} else {
						System.out.print(unit[line][calum]);
					}
				}
			}
			if (i !=count - 1 ) {
				System.out.println();
			}
		}
	}

	// fireメソッド for文で破壊できる壁などの判定、実行
	static void fire(int a, int b) {
		if (unit[a][b] == '^') {
			for (int shell = a - 1; shell >= 0; shell--) {
				if (unit[shell][b] == '*') {
					unit[shell][b] = '.';
					break;
				} else if (unit[shell][b] == '#' || shell == 0) {
					break;
				} else if (unit[shell][b] == '-') {
					continue;
				}
			}
		}
		if (unit[a][b] == 'v') {
			for (int shell = a + 1; shell < height; shell++) {
				if (unit[shell][b] == '*') {
					unit[shell][b] = '.';
					break;
				} else if (unit[shell][b] == '#' || shell == height - 1) {
					break;
				} else if (unit[shell][b] == '-') {
					continue;
				}
			}
		}
		if (unit[a][b] == '<') {
			for (int shell = b - 1; shell >= 0; shell--) {
				if (unit[a][shell] == '*') {
					unit[a][shell] = '.';
					break;
				} else if (unit[a][shell] == '#' || shell == 0) {
					break;
				} else if (unit[a][shell] == '-') {
					continue;
				}
			}
		}
		if (unit[a][b] == '>') {
			for (int shell = b + 1; shell < width; shell++) {
				if (unit[a][shell] == '*') {
					unit[a][shell] = '.';
					break;
				} else if (unit[a][shell] == '#' || shell == width - 1) {
					break;
				} else if (unit[a][shell] == '-') {
					continue;
				}
			}
		}
	}
}
