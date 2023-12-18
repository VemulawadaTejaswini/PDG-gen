import java.util.*;

public class Main {
	
	public static void main(String[] args) {
		new Main();
	}
	
	boolean ok(int x, int y){
		return x>=0 && y>=0 && x<10 && y<10;
	}
	
	public Main(){
		Scanner cin = new Scanner(System.in);
		int num[][] = new int[10][10];
		while(cin.hasNext()){
			String s = cin.nextLine();
			String[] st = s.split(",");
			int x = Integer.parseInt(st[0]);
			int y = Integer.parseInt(st[1]);
			int size = Integer.parseInt(st[2]);
			if(size==3) size=4;
			for(int i=-2;i<=2;i++){
				for(int j=-2;j<=2;j++){
					if(i*i+j*j>size) continue;
					int nextx = x + i;
					int nexty = y + j;
					if(ok(nextx,nexty)) num[nextx][nexty]++;
				}
			}
		}
		int maxnum = 0;
		int white = 0;
		for(int i=0;i<10;i++){
			for(int j=0;j<10;j++){
				maxnum = Math.max(maxnum, num[i][j]);
				if(num[i][j]==0) white++;
			}
		}
		System.out.println(white);
		System.out.println(maxnum);
	}
}