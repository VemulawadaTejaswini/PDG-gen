import java.util.Scanner;

public class Main{

	void run(){
		Scanner sc = new Scanner(System.in);
		int divSize = 100;
		int INF = Integer.MAX_VALUE;
		while(true){
			int r = sc.nextInt();
			int c = sc.nextInt();
			int q = sc.nextInt();
			if((r|c|q)==0)break;
			int[][] a = new int[r][c];
			for(int i=0;i<r;i++)for(int j=0;j<c;j++)a[i][j]=sc.nextInt();
			int xsize = 1;while(xsize*divSize<c)xsize++;
			int ysize = 1;while(ysize*divSize<r)ysize++;
			int x[][] = new int[r][xsize];
			for(int i=0;i<r;i++){
				for(int j=0;j<xsize;j++){
					int min = INF;
					for(int k=j*divSize;k<c&&k<(j+1)*divSize;k++)min = Math.min(min, a[i][k]);
					x[i][j] = min;
				}
			}
			int y[][] = new int[c][ysize];
			for(int j=0;j<c;j++){
				for(int k=0;k<ysize;k++){
					int min = INF;
					for(int i=k*divSize;i<r&&i<(k+1)*divSize;i++)min = Math.min(min, a[i][j]);
					y[j][k] = min;
				}
			}
			int xy[][] = new int[ysize][xsize];
			for(int i=0;i<ysize;i++){
				for(int j=0;j<xsize;j++){
					int min = INF;
					for(int k=j*divSize;k<c&&k<(j+1)*divSize;k++)min = Math.min(min, y[k][i]);
					xy[i][j] = min;
				}
			}
//			System.out.println("XSIZE: " + xsize + " Ysize:" + ysize);
//			for(int i=0;i<r;i++)for(int j=0;j<xsize;j++)System.out.println("X: Row:" + i + " Backet:" + j + " Val:" + x[i][j]);
//			for(int i=0;i<c;i++)for(int j=0;j<ysize;j++)System.out.println("Y: Col:" + i + " Backet:" + j + " Val:" + y[i][j]);
//			for(int i=0;i<ysize;i++)for(int j=0;j<xsize;j++)System.out.println("XY: Block Row:" + i + " Block Col:" + j + " Val:" + xy[i][j]);
			while(q--!=0){
				int y1 = sc.nextInt();
				int x1 = sc.nextInt();
				int y2 = sc.nextInt();
				int x2 = sc.nextInt();
				int ry = 0;
				int min = INF;
				while(ry<ysize){
					if((ry+1)*divSize-1<y1){
						ry++;continue;
					}
					//ry row block
					if(y1<=ry*divSize&&(ry+1)*divSize-1<=y2){
						int rx = 0;
						while(rx<xsize){
							if((rx+1)*divSize-1<x1){
								rx++;
								continue;
							}
							//rx col block
							if(x1<=rx*divSize&&(rx+1)*divSize-1<=x2){
								min = Math.min(min, xy[ry][rx]);
							}
							else{
								for(int j=rx*divSize;j<=(rx+1)*divSize-1;j++){
									if(x1<=j&&j<=x2)min = Math.min(min, y[j][ry]);
								}
							}
							rx++;
						}
					}
					//not hit block ry
					else{
						for(int i=ry*divSize;i<=(ry+1)*divSize-1;i++){
							if(!(y1<=i&&i<=y2))continue;
							int rx = 0;
							while(rx<xsize){
								if((rx+1)*divSize-1<x1){
									rx++;continue;
								}
								//hit rx block
								if(x1<=rx*divSize&&(rx+1)*divSize-1<=x2){
									min = Math.min(min, x[i][rx]);
								}
								else{
									for(int j=rx*divSize;j<=(rx+1)*divSize-1;j++){
										if(x1<=j&&j<=x2)min = Math.min(min, a[i][j]);
									}
								}
								rx++;
							}
						}
					}
					ry++;
				}
				System.out.println(min);
			}
		}
	}

	public static void main(String[] args) {
		new Main().run();
	}
}