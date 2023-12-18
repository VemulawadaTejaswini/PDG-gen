import java.util.*;

class Main{
public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	int h = sc.nextInt();
	int w = sc.nextInt();
	String[] s = new String[h];
	for(int i = 0; i < h; i++) {
		s[i] = sc.next();
	}
	char[][] a = new char[h + 2][w + 2];
	for(int i = 0; i < h; i++) {
		for(int j = 0; j < w; j++) {
			a[i + 1][j + 1] = s[i].charAt(j);
		}
	}
	int cout = 0;
	int[][] b = new int[h][w];
	for(int i = 0; i < h; i++) {
		for(int j = 0; j < w; j++) {
			if(a[i + 1][j + 1] == '.') {
				for(int p = -1; p < 2; p++) {
					for(int q = -1; q < 2; q++) {
						if(a[i + 1 + p][j + 1 + q] == '#') {
							b[i][j]++;
						}
					}
				}
			cout = 0;
			}
		}	
	}
	for(int i = 0; i < h; i++) {
		for(int j = 0; j < w; j++) {
			if(a[i + 1][j + 1] == '#') {
				System.out.print("#");
			} else {
				System.out.print(b[i][j]);
			}
		}
		System.out.println("");      
	}
}
}