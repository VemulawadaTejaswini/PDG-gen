

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int t,n,c;
		while(true) {
			c=0;
			int[][] area = new int[61][61];
			t=sc.nextInt();
			n=sc.nextInt();
			if(t==0) {break;}
			for(int i=0;i<n;i++) {
				area[sc.nextInt()+30][sc.nextInt()+30] = -1000;
			}
			canMove(area,sc.nextInt()+30,sc.nextInt()+30,t);
			
			for(int i=0;i<61;i++) {
				for(int j=0;j<61;j++) {
					if(area[i][j] > 0) {
						c++;
					}
				}
			}
			System.out.println(c);
		}
		sc.close();
	}
	
	public static void canMove(int[][] area,int x,int y,int maxt) {
		
		for(int i=0;i<=maxt;i++) {
			if(area[x][y] >= 0) {
				area[x][y] ++;
				canMove(area,x,y+1,maxt-1);
				canMove(area,x+1,y+1,maxt-1);
				canMove(area,x-1,y,maxt-1);
				canMove(area,x+1,y,maxt-1);
				canMove(area,x,y-1,maxt-1);
				canMove(area,x-1,y-1,maxt-1);
			}
		}
		return;
//		 return area;
	}

}
