import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while(true){
			int w = sc.nextInt();
			int h = sc.nextInt();
			if(w+h==0) break;
			int[][] tile = new int[h+2][w+2];
			int start_x = 0, start_y = 0;
			for(int i=1; i<=h; i++){
				String temp = sc.next();
				for(int j=1; j<=w; j++){
					if(temp.charAt(j-1)=='.'){
						tile[i][j] = 1;
					}else if(temp.charAt(j-1)=='@'){
						tile[i][j] = 1;
						start_x = j;
						start_y = i;
					}
				}
			}
			int count = Main.Count_tile(tile, start_x, start_y);
			System.out.println(count);
		}
	}

	static final int[] dx = {1, 0, -1, 0};
	static final  int[] dy = {0, 1, 0, -1};

	static int Count_tile(int[][] tile, int x, int y){
		int sum = 1;
		tile[y][x] = 0;
		for(int i=0; i<4; i++){
			if(tile[y+dy[i]][x+dx[i]]==1){
				sum += Main.Count_tile(tile, x+dx[i], y+dy[i]);
			}
		}
		return sum;
	}
}