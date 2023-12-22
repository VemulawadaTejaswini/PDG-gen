import java.util.Scanner;

class Main{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int n = scan.nextInt();
		int m = scan.nextInt();
		int [][] det = new int [n][m];
		int [] b = new int [m];

		for(int i = 0; i < n ; i++){
			for(int j = 0 ; j < m ; j++){
				det[i][j] = scan.nextInt();
			}
		}

		for(int i = 0 ; i < m ; i++){
			b [i] = scan.nextInt();

		}
		
		for(int i = 0 ; i < n ; i++){
			int sum = 0 ;
			for(int j = 0 ; j < m ; j++){
			   sum += det[i][j]*b[j];
			}
			System.out.println(sum);
		}

	}
}