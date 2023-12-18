import java.util.Scanner;

public class Main {

	/**
	 * @param args
	 */
	static int[][] a;
	static int[] v1 = {0, 1, 0, -1};
	static int[] v2 = {1, 0, -1, 0};
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		while(cin.hasNext()){
			a = new int[14][14];
			int count=0;
			for(int i = 1; i <= 12; i++){
				String str = cin.next();
				for(int j = 0; j < str.length();j++){
					a[i][j+1] = Integer.parseInt(String.valueOf((char)(str.charAt(j)+1)));
				}
			}
			for(int i = 1 ; i <= 12; i++){
				for(int j = 1; j <= 12; j++){
					if(a[i][j]==2){
						dfs(i, j);
						count++;
					}
				}
			}
			System.out.println(count);
		}
	}
	static void dfs(int x, int y){
		a[x][y]=1;
		for(int i = 0; i < 4;i++){
			int xx = x+v1[i];
			int yy = y+v2[i];
			if(a[xx][yy]==2){
				dfs(xx, yy);
			}
		}
	}
}