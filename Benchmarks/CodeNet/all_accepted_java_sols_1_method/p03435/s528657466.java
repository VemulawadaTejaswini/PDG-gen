import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[][] c=new int[3][3];
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				c[i][j]=sc.nextInt();
			}
		}
		int[][] dx=new int [3][2];
		int[][] dy=new int [2][3];
		for(int i=0;i<3;i++) {
			dx[i][0]=(c[i][0]-c[i][1]);
			dx[i][1]=(c[i][1]-c[i][2]);
		}
		for(int j=0;j<3;j++) {
			dy[0][j]=Math.abs(c[0][j]-c[1][j]);
			dy[1][j]=Math.abs(c[1][j]-c[2][j]);
		}
		for(int i=0;i<2;i++) {
			if(dy[i][0]!=dy[i][1]||dy[i][0]!=dy[i][2]) {
				System.out.println("No");
				return;
				}
		}
		for(int j=0;j<2;j++) {
			if(dx[0][j]!=dx[1][j]||dx[0][j]!=dx[2][j]) {
				System.out.println("No");
				return;
				}
		}
		System.out.println("Yes");
		}
}
