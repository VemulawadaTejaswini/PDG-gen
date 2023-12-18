import java.util.Scanner;

class Main{
	static int[][] pond;
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		pond=new int[14][14];
		String tmp="";
		while(sc.hasNext()) {
			for(int i=0; i<=13; i++) {
				for(int j=0; j<=13; j++) {
					pond[i][j]=0;
				}
			}
			for(int i=1; i<=12; i++) {
				tmp=sc.next();
				for(int j=1; j<=12; j++) {
					pond[i][j]=Integer.parseInt(tmp.charAt(j-1)+"");
				}
			}

			int kosu=0;		//池の個数

			for(int i=0; i<=13; i++) {
				for(int j=0; j<=13; j++) {
					if(pond[i][j]==1) {
						kosu++;
						DFS_ike(i,j);
					}
				}
			}
			System.out.println(kosu);
		}
	}

	public static void DFS_ike(int x,int y) {
		pond[x][y]=0;		//池を消す
		for(int dx=-1; dx<=1; dx++) {
			for(int dy=-1; dy<=1; dy++) {
				int nx=x+dx;
				int ny=y+dy;
				if(0<=nx && nx<13 && 0<=ny && ny<13 && pond[nx][ny]==1) {
					if(Math.abs(dx)+Math.abs(dy)==1) {
						DFS_ike(nx,ny);
					}
				}
			}
		}
	}
}



