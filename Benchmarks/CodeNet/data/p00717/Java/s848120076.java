
import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Main p = new Main();
	}

	public Main() {
		Scanner sc = new Scanner(System.in);
		while(true){
			int n = sc.nextInt();
			if(n==0)
				break;
			
			
			int m = sc.nextInt();

			int[][] xy = new int[2][m];
			
			int[][] xx = new int[8][m];
			int[][] yy = new int[8][m];
			xy[0][0] = sc.nextInt();
			xy[1][0] = sc.nextInt();
			for(int i=1;i<m;i++){
				xy[0][i] = sc.nextInt() - xy[0][0];
				xy[1][i] = sc.nextInt() - xy[1][0];
			}
			xy[0][0] = xy[1][0] = 0;
			
			for(int i=0;i<4;i++){
				for(int j=0;j<m;j++){
					xx[i][j] = xy[i%2][j] * (Math.abs(i-2)==2 ? 1 : -1);
					yy[i][j] = xy[(i+1)%2][j] * (i/2==0 ? 1 : -1);
				}
				
				for(int j=m-1;j>=0;j--){
					xx[i+4][m-j-1] = xx[i][j]-xx[i][m-1];
					yy[i+4][m-j-1] = yy[i][j]-yy[i][m-1];
				}
//				System.out.println(Arrays.toString(xx[i]));
//				System.out.println(Arrays.toString(xx[i+4]));
			}
			
			for(int i=0;i<n;i++){
				m = sc.nextInt();
				xy[0][0] = sc.nextInt();
				xy[1][0] = sc.nextInt();
				for(int j=1;j<m;j++){
					xy[0][j] = sc.nextInt() - xy[0][0];
					xy[1][j] = sc.nextInt() - xy[1][0];
				}
				xy[0][0] = xy[1][0] = 0;
				if(solve(xy, xx, yy))
					System.out.println(i+1);
			}
			System.out.println("+++++");
		}
	}

	public boolean solve(int[][] xy, int[][] xx, int[][] yy) {
		boolean res = false;
		for(int i=0;i<xx.length;i++){
			boolean r = true;
			for(int j=0;j<xx[i].length;j++){
				if(xx[i][j]!=xy[0][j] || yy[i][j]!=xy[1][j]){
					r=false;
					break;
				}	
			}
			res |= r;
		}
		
		return res;
	}

}