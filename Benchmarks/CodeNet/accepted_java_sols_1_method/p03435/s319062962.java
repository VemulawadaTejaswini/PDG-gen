import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int[][] c = new int[3][3];
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				c[i][j] = in.nextInt();
			}
		}
		int[] sum = new int[6];
		sum[0] = c[0][0] + c[1][1] + c[2][2];
		sum[1] = c[0][1] + c[1][2] + c[2][0];
		sum[2] = c[0][2] + c[1][0] + c[2][1];
		sum[3] = c[0][0] + c[1][2] + c[2][1];
		sum[4] = c[0][1] + c[1][0] + c[2][2];
		sum[5] = c[0][2] + c[1][1] + c[2][0];
		boolean takahashi = true;
		for(int i=1;i<6;i++) {
			if(sum[0]!=sum[i]) {
				takahashi = false;
				break;
			}
		}
		if(takahashi) System.out.println("Yes");
		else System.out.println("No");
		in.close();

	}

}
