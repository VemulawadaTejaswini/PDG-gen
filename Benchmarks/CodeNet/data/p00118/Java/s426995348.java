import java.util.Scanner;

public class Main {

	static int h,w;
	static int[][] field;
	static int[] v1 = {0,1,0,-1};
	static int[] v2 = {1,0,-1,0};
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		while(true){
			h=cin.nextInt();
			w=cin.nextInt();
			if(h+w==0){
				break;
			}
			field = new int[h+2][w+2];
			for(int i = 0;i<h;i++){
				String str = cin.next();
				for(int j=0;j<w;j++){
					if(str.charAt(j)=='#'){
						field[i+1][j+1]=1;
					}
					else if(str.charAt(j)=='@'){
						field[i+1][j+1]=2;
					}
					else{
						field[i+1][j+1]=3;
					}
				}
			}
			int count=0;
			for(int i = 0;i<h;i++){
				for(int j=0;j<w;j++){
					if(field[i+1][j+1]!=0){
						count++;
					}
					dfs(i+1,j+1,field[i+1][j+1]);
				}
			}
			System.out.println(count);
		}
	}
	static void dfs(int x,int y,int value){
		
		if(field[x][y]==0){
			return;
		}
		field[x][y]=0;
		for(int i = 0;i<4;i++){
			int xx=x+v1[i];
			int yy=y+v2[i];
			if(field[xx][yy]==value){
				dfs(xx,yy,field[xx][yy]);
			}
		}
	}
}