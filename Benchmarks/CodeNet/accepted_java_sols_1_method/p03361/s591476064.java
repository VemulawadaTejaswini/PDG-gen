import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int h = sc.nextInt();
		int w = sc.nextInt();
		
		boolean[][] canvas = new boolean[h][w];
		boolean[][] candraw = new boolean[h][w];
		
		for(int y =0; y<h ; y++) {
			String line = sc.next();
			for(int x =0; x<w ; x++) {
				if(line.codePointAt(x)=='#') {
					canvas[y][x]=true;
					candraw[y][x]=false;
				} else {
					canvas[y][x]=false;
					candraw[y][x]=true;
				}
			}
		}

		for(int y =0; y<h ; y++) {
			for(int x =0; x<w ; x++) {
				if(canvas[y][x]==true) {
					if(x<w-1&&canvas[y][x+1]==true) {
						candraw[y][x]=true;
						candraw[y][x+1]=true;
					}
					if(y<h-1&&canvas[y+1][x]==true) {
						candraw[y][x]=true;
						candraw[y+1][x]=true;
					}
				}
			}
		}
		
		boolean CAN = true;
		for(int y =0; y<h ; y++) {
			for(int x =0; x<w ; x++) {
				if(candraw[y][x]==false) {
					CAN=false;
				}
			}
		}
		if(CAN) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
	}
}