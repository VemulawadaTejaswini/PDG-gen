import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int h = stdIn.nextInt();
		int w = stdIn.nextInt();

		char[][] map = new char[h][w];

		for(int i = 0; i < h; i++) {
			map[i] = stdIn.next().toCharArray();
		}

		for(int i = 0; i < h; i++) {
			for(int j = 0; j < w; j++) {

				if(map[i][j] == '.') {
					boolean flag = true;
					for(int k = 0; k < h; k++) {//縦方向
						if(map[k][j] != '.'&& map[k][j] !='〇')flag = false;
					}
					if(flag) {
						for(int k = 0; k < h; k++) {
							map[k][j] = '〇';
						}
					}

					boolean flag2 = true;
					for(int k = 0; k < w; k++) {//横方向
						if(map[i][k] != '.' && map[i][k] !='〇')flag2 = false;
					}
					if(flag2) {
						for(int k = 0; k < w; k++) {
							map[i][k] = '〇';
						}
					}
				}
			}
		}

		for(int i = 0; i < h; i++) {
			int index = 0;
			for(int j = 0; j < w; j++) {
				if(map[i][j] =='〇') {
					index++;
					continue;
				}
				System.out.print(map[i][j]);
			}
			if(index == w) {
				index = 0;
				continue;
			}
			System.out.println();
		}


	}

}
