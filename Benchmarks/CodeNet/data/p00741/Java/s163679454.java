import java.util.Scanner;

public class Main{
	static int c[][];
	static int h,w;
	private static void land(int x, int y){
		c[x][y] = 0;

		for(int i = x-1; i <= x+1; i++){
			if(i < 0 || i >= h) continue;
			for(int j = y-1; j <= y+1; j++){
				if(j < 0 || j >= w) continue;
				if(c[i][j] == 1) land(i, j);
			}
		}
	}
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		while(true){
			int count = 0;
			w = sc.nextInt();
			h = sc.nextInt();
			if(w == 0 && h == 0) break;
			c = new int[h][w];
			for(int i = 0; i < h; i++){
				for(int j = 0; j < w; j++){
					c[i][j] = sc.nextInt();
				}
			}
			for(int i = 0; i < h; i++){
				for(int j = 0; j < w; j++){
					if(c[i][j] == 1){
						land(i, j);
						count++;
					}
				}
			}
			System.out.println(count);
		}
	}
}