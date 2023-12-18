import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		int n = stdIn.nextInt();
		int[][] p = new int[n][n];
		int left = 0;
		int up = 0;
		int right = n-1;
		int down = n-1;
		int nowColor = 0;
		while(true){
			++nowColor;
			if(nowColor==4) nowColor = 1;
			for(int i=0;i<n;i++){
				if(p[up][i]==0){
					p[up][i] = nowColor;
				}
				if(p[down][i]==0){
					p[down][i] = nowColor;
				}
				if(p[i][left]==0){
					p[i][left] = nowColor;
				}
				if(p[i][right]==0){
					p[i][right] = nowColor;
				}
			}
			up++;
			down--;
			left++;
			right--;
			if(down<up){
				break;
			}
		}
//		for(int i=0;i<n;i++){
//			for(int j=0;j<n;j++){
//				System.out.print(p[i][j]);
//			}
//			System.out.println();
//		}
		int k = stdIn.nextInt();
		for(int i=0;i<k;i++){
			int a = stdIn.nextInt();
			int b = stdIn.nextInt();
			System.out.println(p[b-1][a-1]);
		}
	}
}