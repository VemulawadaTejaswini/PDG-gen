import java.util.Scanner;


public class Main {


	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int m = scan.nextInt();
		int[][] a = new int[n][m];
		int[] 	b = new int[m];
		int[] 	c = new int[n];

		for(int i=0;i<n;i++){
			for(int j=0;j<m;j++){
				a[i][j]=scan.nextInt();
			}
		}

		for(int i=0;i<m;i++){
			b[i]=scan.nextInt();
		}



		for(int i=0;i<n;i++){
			for(int j=0;j<m;j++){
				c[i]=c[i]+a[i][j]*b[j];
			}
		}

		for(int data:c){
			System.out.println(data);
		}
	}
}