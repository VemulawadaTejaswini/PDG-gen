import java.util.Scanner;

public class Main {
	
	static int h,w;
	static int[][] p=new int[9][9];
	static int c, size;
	
	static void dfs1(int[][] cpp,int count) {
		int[][] cp=new int[9][9];
		for(int i=1; i<=6; i++) {
			if(count==5 && i!=c) continue;
			if(i==cpp[1][1]) continue;
			for(int x=1; x<=h; x++) {
				for(int y=1; y<=w; y++) {
					cp[x][y]=cpp[x][y];
					//System.out.print(cp[x][y]);
				}
				//System.out.println();
			}
			//System.out.println();
			if(count==6) {
				dfs(cp, 1,1,cp[1][1], 0);
			}
			else {
				//System.out.println(cp[1][1]+" "+i);
				dfs(cp, 1,1,cp[1][1],i);
			}
			if(count==6) {
				int sum=0;
				for(int x=1; x<=h; x++) {
					for(int y=1; y<=w; y++) {
						if(cp[x][y]==0) {
							sum++;
						}
					}
				}
				size=Math.max(sum, size);
				//System.out.println("size="+size);
				return;
			}
			dfs1(cp, count+1);
		}
	}
	
	static void dfs(int[][] cp, int x, int y, int c1, int c2) {//c1変化前　c2変化後
		if(x>=1 && x<=h && y>=1 && y<=w) {
			if(cp[x][y]==c1) {
				cp[x][y]=c2;
				dfs(cp, x+1, y, c1, c2);
				dfs(cp, x-1, y, c1, c2);
				dfs(cp, x, y+1, c1, c2);
				dfs(cp, x, y-1, c1, c2);
			}
		}
	}
	
	
	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)){
			while(sc.hasNext()) {
				h=sc.nextInt();
				w=sc.nextInt();
				c=sc.nextInt();
				if(h+w+c==0) break;
				
				for(int i=1; i<=h; i++) {
					for(int j=1; j<=w; j++) {
						p[i][j]=sc.nextInt();
					}
				}
				size=0;
				dfs1(p, 1);
				System.out.println(size);
			}



		}
	}
}
