


import java.util.Scanner;



public class Main {


	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int h = sc.nextInt();
		int w = sc.nextInt();
		String[]s = new String[h];
		for (int i=0;i<h;i++) {
			s[i]=sc.next();
		}
		
		int[][] xMin = new int[h][w];
		int[][] xMax = new int[h][w];
		int[][] yMin = new int[h][w];
		int[][] yMax = new int[h][w];
		
		for (int i=0;i<h;i++) {
			int tmpYMin = 0;
			for (int j=0;j<w;j++) {
				if (s[i].charAt(j)=='#') {
					tmpYMin = j+1;
				} else {
					yMin[i][j]=tmpYMin;
				}
			}
			int tmpYMax = w-1;
			for (int j=w-1;j>=0;j--) {
				if (s[i].charAt(j)=='#') {
					tmpYMax = j-1;
				} else {
					yMax[i][j]=tmpYMax;
				}
			}
		}
		
		for (int j=0;j<w;j++) {
			int tmpXMin = 0;
			for (int i=0;i<h;i++) {
				if (s[i].charAt(j)=='#') {
					tmpXMin = i+1;
				} else {
					xMin[i][j]=tmpXMin;
				}
			}
			int tmpXMax = h-1;
			for (int i=h-1;i>=0;i--) {
				if (s[i].charAt(j)=='#') {
					tmpXMax = i-1;
				} else {
					xMax[i][j]=tmpXMax;
				}
			}
		}
		
		int ans = 0;
		for (int i=0;i<h;i++) {
			for (int j=0;j<w;j++) {
				ans = Math.max(ans, xMax[i][j]-xMin[i][j]+yMax[i][j]-yMin[i][j]+1);
			}
		}
		
		System.out.println(ans);
	}
}




