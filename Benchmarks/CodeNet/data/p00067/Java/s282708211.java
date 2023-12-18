import java.util.Scanner;
public class Main{
	static boolean map[][]=new boolean[12][12];
	static int ans=0; 
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()){
			for(int i=0;i<12;i++){
				char[] c = sc.next().toCharArray();
				for(int j=0;j<12;j++){
					map[i][j]=c[j]=='1';
				}
			}
			int ans=0;
			for(int i=0;i<12;i++){
				for(int j=0;j<12;j++){
					if(map[i][j]){
						dfs(i, j);
						ans++;
					}
				}
			}
			System.out.println(ans);
		}	
	}
	public static void dfs(int x,int y){
		map[x][y] = false;
		int x_c[]={1,0,-1,0};
		int y_c[]={0,1,0,-1};
		for(int i=0;i<4;i++){
			int x1=x+x_c[i];
			int y1=y+y_c[i];
			if(0<=x1&&0<=y1&&x1<12&&y1<12&&map[x1][y1])//
				dfs(x1, y1);		
		}
	}
}