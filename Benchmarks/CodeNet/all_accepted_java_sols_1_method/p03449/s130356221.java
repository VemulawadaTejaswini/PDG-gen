import java.util.Scanner;

class Main {

	public static void main(String args[]){

		Scanner scan = new Scanner(System.in);
		int n;
		n = scan.nextInt();
		int x[][] = new int[2][n];
		
		for(int i = 0; i < 2; i++)
			for(int j = 0; j < n; j++)
				x[i][j] = scan.nextInt();
		
		scan.close();
		
		int sum;
		int max = 0;
		

		for(int i = 0; i < n; i++){
			sum = 0;
			for(int j = 0; j <= i; j++){
				sum += x[0][j];
			}
			for(int j = i; j < n; j++){
				sum += x[1][j];
			}
			if(sum >= max)max =sum;
		}	
		System.out.print(max);
	}
}