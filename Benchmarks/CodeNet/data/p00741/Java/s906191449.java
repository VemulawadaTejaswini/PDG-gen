package icpc2009;

import java.util.Scanner;

public class Main {
	int map[][];
	int w,h,k;

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Main().solve();
	}
	
	void solve(){
		System.out.println("TES");
		Scanner sc=new Scanner(System.in);
		while(true){
			w=sc.nextInt();
			h=sc.nextInt();
			int n=0;
			if(w+h==0)break;
			map=new int[w][h];
			for(int y=0;y<h;y++){
				for(int x=0;x<w;x++){
					map[x][y]=sc.nextInt();
				}
			}
			for(int x=0;x<w;x++){
				for(int y=0;y<h;y++){
					if(map[x][y]==1){
						def(x,y);
						n++;
					}
				}
			}
			System.out.println(n);
		}
	}
	
	void def(int x,int y){
		map[x][y]=0;
		for(int xi=-1;xi<=1;xi++){
			for(int yi=-1;yi<=1;yi++){
				if(x+xi>=0&&x+xi<w&&y+yi>=0&&y+yi<h){
					if(map[x+xi][y+yi]==1)def(x+xi,y+yi);
				}
			}			
		}
	}

}