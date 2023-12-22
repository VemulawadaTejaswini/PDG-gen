
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();	//notices
		int b = 0;		//buildings 4
		int f = 0;		//floors 3
		int r = 0;		//rooms	10
		int v = 0;		//persons
		
		//创建三维数组 值为0
		int[][][] buildings = new int[4][3][10];
		for(int i=0;i<4;i++) {
			for(int j=0;j<3;j++) {
				for(int k=0;k<10;k++) {
					buildings[i][j][k]=0;
				}
			}
		}
		
		for(int i=0;i<n;i++) {
			b = scanner.nextInt();
			f = scanner.nextInt();
			r = scanner.nextInt();
			v = scanner.nextInt();
			//三维数组
			buildings[b-1][f-1][r-1] += v;
		}
		for(int i=0;i<4;i++) {
			if (i!=0) {
				System.out.println("####################");
			}
			for(int j=0;j<3;j++) {
				for(int k=0;k<10;k++) {
					System.out.print(" " + buildings[i][j][k]);
				}
				System.out.println();
			}
		}
		scanner.close();
	}
}
