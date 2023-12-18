import java.util.Scanner;

class Main{
	static int[][] meiro;
	static boolean[][] visited;
	public static void main(String[] aegs) {
		Scanner sc=new Scanner(System.in);

		while(true) {
			int H=sc.nextInt();
			int W=sc.nextInt();
			if(H*W==0) {
				System.exit(0);
			}
			else {
				meiro=new int[H+2][W+2];
				int[] vectorx= {1,0,-1,0};
				int[] vectory= {0,-1,0,1};		// migi ue hidari sita
				char[] vec= {'>','^','<','v'};
				visited=new boolean[H+2][W+2];
				int x=1;
				int y=1;
				boolean end=false;
				String[] me=new String[H+2];
				for(int i=0; i<H+2; i++) {
					me[0]=me[0]+".";
					me[H+1]=me[H+1]+".";
				}
				for(int i=0; i<H; i++) {
					me[i+1]="."+sc.next()+".";
				}

				for(int i=0; i<H+2; i++) {
					for(int j=0; j<W+2; j++) {
						if(me[i].charAt(j)=='.') {
							meiro[i][j]=4;
						}
						else {
							for(int k=0; k<4; k++) {
								if(me[i].charAt(j)==vec[k]) {
									meiro[i][j]=k;
								}
							}
						}
					}
				}

				while(true) {
					//System.out.println((x)+" "+(y)+" "+meiro[y][x]);
					if(visited[y][x]==true && end==false) {
						System.out.println("LOOP");
						break;
					}
					else {
						visited[y][x]=true;
						if(meiro[y][x]==4 || end==true) {
							end=true;
							System.out.println((x-1)+" "+(y-1));
							break;
						}
						else {
							int tmpx=x;
							int tmpy=y;

							if(x+vectorx[meiro[tmpy][tmpx]]==W+1 || y+vectory[meiro[tmpy][tmpx]]==H+1) {
								end=true;
							}
							else {
								x=x+vectorx[meiro[tmpy][tmpx]];
								y=y+vectory[meiro[tmpy][tmpx]];
							}
						}
					}
				}
			}
		}
	}
}
