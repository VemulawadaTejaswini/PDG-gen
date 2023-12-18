import java.util.Scanner;


/*   3
 * 0   2
 *   1
 */

public class Main {

	static int[] v1 ={-1, 0, 1, 0};
	static int[] v2 ={0, 1, 0, -1};
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		while(true){
			int n = cin.nextInt();
			if(n==0){
				break;
			}
			int[][] a = new int[n*2+2][n*2+2];
			
			int[][] pair = new int[n][2];
			pair[0][0]=n/2+1;
			pair[0][1]=n/2+1;
			a[n/2][n/2]=1;
			
			int minx=n/2+1,maxx=n/2+1,miny=n/2+1,maxy=n/2+1;
			for(int i = 1; i < n;i++){
				int ni=cin.nextInt();
				int d=cin.nextInt();
				int x = pair[ni][0]+v1[d];
				int y = pair[ni][1]+v2[d];
				pair[i][0]=x;
				pair[i][1]=y;
				//System.out.println(x + " " + y);
				//a[x][y]=1;
				if(minx > x){
					minx = x;
				}
				if(maxx < x){
					maxx = x;
				}
				if(miny > y){
					miny = y;
				}
				if(maxy < y){
					maxy = y;
				}
			}
			for(int i = 0; i < n*2+2;i++){
				for(int j = 0; j < n*2+2;j++){
					//System.out.print(a[i][j] + " " );
				}
				//System.out.println();
			}
			System.out.println((maxx-minx+1) +" "+(maxy-miny+1));
		}
	}
}