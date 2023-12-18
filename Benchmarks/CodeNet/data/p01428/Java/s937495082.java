import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
public class Main {
	static char[][] map = new char[8][8];
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		for(int i = 0; i < 8; i++) {
			String tmp = stdIn.next();
			for(int j = 0; j < 8; j++) {
				map[i][j] = tmp.charAt(j);
			}
		}
		
		while(true) {
			boolean M = cC();
			boolean C = cM();

			
			if(!M && !C) {
				break;
			}
		}
		for(int i = 0; i < 8; i++) {
			for(int j = 0; j < 8; j++) {
				System.out.print(map[i][j]);
			}
			System.out.println();
		}
	}
	static int[] xv = {1 ,0 ,-1,0 ,1 ,1 ,-1,-1};
	static int[] yv = {0 ,1 ,0 ,-1,1 ,-1,1 ,-1};
	public static boolean cM() {
		int max = 0;
		int maxX = 0;
		int maxY = 0;
		for(int i = 0; i < 8; i++) {
			for(int j = 0; j < 8; j++) {
				if(map[i][j] != '.') {
					continue;
				}
				int NM = 0;
				for(int k = 0; k < 8; k++) {
					for(int l = 1; l < 10; l++) {
						int x = j + xv[k]*l;
						int y = i + yv[k]*l;
						if(x < 0 || y < 0 || x > 7 || y > 7) break;
						if(map[y][x] == '.') {
							break;
						}
						if(map[y][x] == 'x') {
							NM += (l-1);
							break;
						}
					}
				}
				//ch
				if(NM > max) {
					max = NM;
					maxX = j;
					maxY = i;
				}
				else if(NM == max) {
					if(maxY < i) {
						maxY = i;
						maxX = j;
					}
					else if(maxY == i && maxX < j) {
						maxX = j;
					}
				}
			}
		}
		
		if(max == 0) {
			return false;
		}
		for(int k = 0; k < 8; k++) {
			IN:for(int l = 1; l < 10; l++) {
				int x = maxX + xv[k]*l;
				int y = maxY + yv[k]*l;
				if(x < 0 || y < 0 || x > 7 || y > 7) break;
				if(map[y][x] == '.') {
					break IN;
				}
				if(map[y][x] == 'x') {
					for(int m = 0; m < l; m++) {
						map[maxY + yv[k]*m][maxX + xv[k]*m] = 'x';
					}
					break IN;
				}
			}
		}
		return true;
	}
	public static boolean cC() {
		int max = 0;
		int maxX = 0;
		int maxY = 0;
		for(int i = 0; i < 8; i++) {
			for(int j = 0; j < 8; j++) {
				if(map[i][j] != '.') {
					continue;
				}
				int NM = 0;
				for(int k = 0; k < 8; k++) {
					for(int l = 1; l < 10; l++) {
						int x = j + xv[k]*l;
						int y = i + yv[k]*l;
						if(x < 0 || y < 0 || x > 7 || y > 7) break;
						if(map[y][x] == '.') {
							break;
						}
						if(map[y][x] == 'o') {
							NM += (l-1);
							break;
						}
					}
				}
				if(NM > max) {
					max = NM;
					maxX = j;
					maxY = i;
				}
				else if(NM == max) {
					if(maxY > i) {
						maxY = i;
						maxX = j;
					}
					else if(maxY == i && maxX > j) {
						maxX = j;
					}
				}
			}
		}
		
		if(max == 0) {
			return false;
		}
		for(int k = 0; k < 8; k++) {
			IN:for(int l = 1; l < 10; l++) {
				int x = maxX + xv[k]*l;
				int y = maxY + yv[k]*l;
				if(x < 0 || y < 0 || x > 7 || y > 7) break;
				if(map[y][x] == '.' ) {
					break IN;
				}
				if(map[y][x] == 'o') {
					for(int m = 0; m < l; m++) {
						map[maxY + yv[k]*m][maxX + xv[k]*m] = 'o';
					}
					break IN;
				}
			}
		}
		return true;
	}
}