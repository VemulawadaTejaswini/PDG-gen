import java.util.Scanner;

public class Main {

	/**
	 * @param args
	 */
	static int[][] field;
	static int[] v1 = {1,-1,-1,1,1,0,-1,0};
	static int[] v2 = {1,-1,1,-1,0,1,0,-1};
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		while(true){
			int w = cin.nextInt();
			int h = cin.nextInt();
			if(w+h==0){
				break;
			}
			field = new int[h+2][w+2];
			for(int i = 1; i <= h;i++){
				for(int j = 1; j <= w;j++){
					field[i][j]=cin.nextInt();
				}
			}
			int count=0;
			for(int i = 1; i <= h;i++){
				for(int j = 1; j <= w;j++){
					if(field[i][j]==1){
						dfs(i, j);
						count++;
					}
				}
			}
			System.out.println(count);
		}
	}
	static void dfs(int x, int y){
		field[x][y]=0;
		for(int i = 0; i < 8;i++){
			int xx=x+v1[i];
			int yy=y+v2[i];
			if(field[xx][yy]==1){
				dfs(xx,yy);
			}
		}
	}
}