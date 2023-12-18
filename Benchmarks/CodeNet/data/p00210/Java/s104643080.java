import java.util.*;
public class Main {
	static int h;
	static int w;
	static char[][] map;
	static boolean[][] alMove;
	static int[] vy = new int[] {0,-1,0,1};
	static int[] vx = new int[] {1,0,-1,0};
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true) {
			w = sc.nextInt();
			h = sc.nextInt();
			if(w == 0 && h == 0) break;
			map = new char[h][w];
			alMove = new boolean[h][w];
			for(int i = 0; i < h; i++) {
				map[i] = sc.next().toCharArray();
			}
			boolean check = true;
			for(int j = 0; j < h; j++) {
				for(int k = 0; k < w; k++) {
					if(map[j][k] != 'X' && map[j][k] != '.' && map[j][k] != '#') {
						check = false;
						break;
					}
				}
			}
			if(check) {
				System.out.println("0");
				continue;
			}
			int i = 0;
			for(i = 0; i <= 180+1; i++) {
				boolean change = false;
				for(int j = 0; j < h; j++) {
					for(int k = 0; k < w; k++) {
						alMove[j][k] = false;
						if(map[j][k] == 'E') {
							change = true;
							if(rcheck(j+1,k) && (map[j+1][k] == '.' || map[j+1][k] == 'X')) {
								map[j][k] = 'S';
							}
							else if(rcheck(j,k+1) && (map[j][k+1] == '.' || map[j][k+1] == 'X')) {
								map[j][k] = 'E';
							}
							else if(rcheck(j-1,k) && (map[j-1][k] == '.' || map[j-1][k] == 'X')) {
								map[j][k] = 'N';
							}
							else if(rcheck(j,k-1) && (map[j][k-1] == '.' || map[j][k-1] == 'X')) {
								map[j][k] = 'W';
							}
						}
						else if(map[j][k] == 'N') {
							change = true;
							if(rcheck(j,k+1) && (map[j][k+1] == '.' || map[j][k+1] == 'X')) {
								map[j][k] = 'E';
							}
							else if(rcheck(j-1,k) && (map[j-1][k] == '.' || map[j-1][k] == 'X')) {
								map[j][k] = 'N';
							}
							else if(rcheck(j,k-1) && (map[j][k-1] == '.' || map[j][k-1] == 'X')) {
								map[j][k] = 'W';
							}
							else if(rcheck(j+1,k) && (map[j+1][k] == '.' || map[j+1][k] == 'X')) {
								map[j][k] = 'S';
							}
							
						}
						else if(map[j][k] == 'W') {
							change = true;
							if(rcheck(j-1,k) && (map[j-1][k] == '.' || map[j-1][k] == 'X')) {
								map[j][k] = 'N';
							}
							else if(rcheck(j,k-1) && (map[j][k-1] == '.' || map[j][k-1] == 'X')) {
								map[j][k] = 'W';
							}
							else if(rcheck(j+1,k) && (map[j+1][k] == '.' || map[j+1][k] == 'X')) {
								map[j][k] = 'S';
							}
							else if(rcheck(j,k+1) && (map[j][k+1] == '.' || map[j][k+1] == 'X')) {
								map[j][k] = 'E';
							}
						}
						else if(map[j][k] == 'S') {
							change = true;
							if(rcheck(j,k-1) && (map[j][k-1] == '.' || map[j][k-1] == 'X')) {
								map[j][k] = 'W';
							}
							else if(rcheck(j+1,k) && (map[j+1][k] == '.' || map[j+1][k] == 'X')) {
								map[j][k] = 'S';
							}
							else if(rcheck(j,k+1) && (map[j][k+1] == '.' || map[j][k+1] == 'X')) {
								map[j][k] = 'E';
							}
							else if(rcheck(j-1,k) && (map[j-1][k] == '.' || map[j-1][k] == 'X')) {
								map[j][k] = 'N';
							}
						}
					}
				}
				if(!change) break;
				for(int j = 0; j < h; j++) {
					IN:for(int k = 0; k < w; k++) {
						if(map[j][k] == '.') {
							for(int l = 0; l < 4; l++) {
								int x = k + vx[l];
								int y = j + vy[l];
								if(rcheck(y,x)) {
									if(alMove[y][x]) continue;
									if(l == 0) {
										if(map[y][x] == 'W') {
											map[y][x] = '.';
											map[j][k] = 'W';
											alMove[j][k] = true;
											continue IN;
										}
									}
									if(l == 1) {
										if(map[y][x] == 'S') {
											map[y][x] = '.';
											map[j][k] = 'S';
											alMove[j][k] = true;
											continue IN;
										}
									}
									if(l == 2) {
										
										if(map[y][x] == 'E') {
											map[y][x] = '.';
											map[j][k] = 'E';
											alMove[j][k] = true;
											continue IN;
										}
									}
									if(l == 3) {
										if(map[y][x] == 'N') {
											map[y][x] = '.';
											map[j][k] = 'N';
											alMove[j][k] = true;
											continue IN;
										}
									}
								}
							}
						}
						if(map[j][k] == 'X') {
							for(int l = 0; l < 4; l++) {
								int x = k + vx[l];
								int y = j + vy[l];
								if(rcheck(y,x)) {
									if(alMove[y][x]) break;
									if(l == 0) {
										if(map[y][x] == 'W') {
											map[y][x] = '.';
											alMove[j][k] = true;
											continue IN;
										}
									}
									if(l == 1) {
										if(map[y][x] == 'S') {
											map[y][x] = '.';
											alMove[j][k] = true;
											continue IN;
										}
									}
									if(l == 2) {
										if(map[y][x] == 'E') {
											map[y][x] = '.';
											alMove[j][k] = true;
											continue IN;
										}
									}
									if(l == 3) {
										if(map[y][x] == 'N') {
											map[y][x] = '.';
											alMove[j][k] = true;
											continue IN;
										}
									}
								}
							}
						}
					}
				}
			}
			check = true;
			for(int j = 0; j < h; j++) {
				for(int k = 0; k < w; k++) {
					if(map[j][k] != 'X' && map[j][k] != '.' && map[j][k] != '#') {
						check = false;
						break;
					}
				}
			}
			if(check) {
				System.out.println(i);
			}
			else {
				System.out.println("NA");
			}
		}
	}
	
	public static boolean rcheck(int a, int b) {
		if(a < 0 || b < 0 || a >= h || b >= w) return false;
		return true;
	}
}