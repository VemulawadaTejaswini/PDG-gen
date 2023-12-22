//import java.io.File;
import java.util.Scanner;

class Main{
	public static void main(String[] args) {
try{
		//Scanner scan = new Scanner(new File("in.txt"));
		Scanner scan = new Scanner(System.in);

		int n = scan.nextInt();
		int m = scan.nextInt();
		int l = scan.nextInt();

		int[][] arr1 = new int[n][m];
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < m; j++) {
				arr1[i][j] = scan.nextInt();
			}
		}
		int[][] arr2 = new int[m][l];
		for(int i = 0; i < m; i++) {
			for(int j = 0; j < l; j++) {
				arr2[i][j] = scan.nextInt();
			}
		}

		for(int i = 0; i < n; i++) {
			for(int j = 0; j < l; j++) {
				long sum = 0;
				for(int k = 0; k < m; k++) {
					sum += arr1[i][k]*arr2[k][j];
				}
				System.out.print(sum);
				if(j!=l-1) System.out.print(" ");
			}
			System.out.println();
		}
		

}catch(Exception e) {
	e.printStackTrace();
}
	}
}