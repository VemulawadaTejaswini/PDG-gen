import java.util.Scanner;
public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int w = Integer.parseInt(sc.next());
		int h = Integer.parseInt(sc.next());
		String[] s = new String[w];
		char[][] c = new char[w][h];
		int[] x = {-1,-1,-1,0,0,1,1,1};
		int[] y = {-1,0,1,1,-1,-1,1,0};
		for (int i = 0; i < w; i++) {
			s[i] = sc.next();
		}
		for(int i = 0; i < w;i++) {
			for(int j = 0; j < h; j++) {
				c[i][j] = s[i].charAt(j);
			}
		}
		for (int i = 0; i < w ; i++) {
			for (int j = 0; j < h; j++) {
				int count = 0;
				if(c[i][j] == '.') {
					for(int k = 0;k < 8; k++) {
						if(x[k]+i>=0 && x[k]+i <w && y[k]+j >=0 &&y[k]+j<h) {
							if(c[x[k]+i][y[k]+j]=='#') {
							 count++;
							}
						}
					}
					String temp = String.valueOf( count);
					c[i][j] = temp.charAt(0);
				}
			}
		}
		for(int i = 0; i < w;i++) {
			for(int j = 0; j < h; j++) {
				System.out.print(c[i][j]);
			}
			System.out.println("");
		}
			}
		}