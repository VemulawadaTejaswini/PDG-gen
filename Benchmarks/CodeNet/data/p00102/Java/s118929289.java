import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		while(true) {
			int n = stdIn.nextInt();
			if(n == 0) {
				break;
			}
			int[][] data = new int[n+1][n+1];
			for(int i = 0; i < n; i++) {
				for(int j = 0; j < n; j++) {
					data[i][j] = stdIn.nextInt();
				}
			}
			for(int i = 0; i < n; i++) {
				int sum = 0;
				for(int j = 0; j < n; j++) {
					sum += data[i][j];
				}
				data[i][n] = sum;
			}
			for(int i = 0; i < n+1; i++) {
				int sum = 0;
				for(int j = 0; j < n; j++) {
					sum += data[j][i];
				}
				data[n][i] = sum;
			}
			
			for(int i = 0; i < n+1; i++) {
				for(int j = 0; j < n+1; j++) {
					System.out.printf("%5d",data[i][j]);
				}
				System.out.println();
			}
		}
	}	
}