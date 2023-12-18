

import java.util.Scanner;

public class Main{
	int nx;
	int ny;
	int[] dx = {0,-1,0,1};
	int[] dy = {1,0,-1,0};
	char[][] map;
	boolean flagW ;
	boolean flagB ;
	int res = 0;


	void dfs(int y, int x){
		int sx;
		int sy;
		map[y][x] = 'X';

		for(int i=0; i<4; i++){
			sy = y + dy[i];
			sx = x + dx[i];
			if(sx < 0 || sy <0 || sx >= nx || sy >= ny) continue;

			if(map[sy][sx] == '.'){
				res++;
				dfs(sy,sx);
			}
			else if(map[sy][sx] == 'W')
				flagW = true;

			else if(map[sy][sx] == 'B')
				flagB = true;
		}

	}


	void run(){
		Scanner sc = new Scanner(System.in);


		while (sc.hasNext()) {
			nx = sc.nextInt();
			ny = sc.nextInt();
			String p = sc.nextLine();

			int cntW = 0;
			int cntB = 0;
			map = new char[ny][];


			for (int i = 0; i < ny; i++) {
				String s = sc.nextLine();
				map[i] = s.toCharArray();
			}



			for (int i = 0; i < ny; i++) {
				for (int j = 0; j < nx; j++) {
					if (map[i][j] != '.')
						continue;

					flagW = false;
					flagB = false;
					res = 1;

					dfs(i, j);

					if (flagW && !flagB)
						cntW += res;
					if (flagB && !flagW)
						cntB += res;

				}
			}

			System.out.println(cntB + " " + cntW);
		}

	}

	public static void main(String[] args) {
		new A3().run();
	}

}