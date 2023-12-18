import java.util.Scanner;

class Main
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int res = Integer.MIN_VALUE;
		
		int [][] mat = new int[n][n];
		
		for(int i = 0; i < n; ++i){
			for(int j = 0; j < n; ++j){
				mat[i][j] = sc.nextInt();
			}
		}
		
		int [][] sum = new int[n][n];
		
		for(int i = 0; i < n; ++i){
			for(int j = 0; j < n; ++j){
				for(int k = 0; k <= i; ++k){
					for(int l = 0; l <= j; ++l){
						sum[i][j] += mat[k][l];
					}
				}
			}
		}
		
		for(int i = 0; i < n; ++i){
			for(int j = 0; j < n; ++j){
				for(int k = i; k < n; ++k){
					for(int l = j; l < n; ++l){
						
						int A = 0,B = 0,C = sum[k][l],D = 0;
						
						if( i - 1 >= 0 )
						{
							A = sum[i-1][l];
							if( j > 0 ) D = sum[i-1][j-1];
						}
						
						if( j - 1 >= 0 )
						{
							B = sum[k][j-1];
							if( i > 0 ) D = sum[i-1][j-1];
						}
						
						int csum = C + D - A - B;
						if( csum > res ) res = csum;
					}
				}
			}
		}
		
		System.out.println(res);
		
	}
}