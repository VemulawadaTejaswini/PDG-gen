import java.util.Scanner;

public class Main {


	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
			int N  = sc.nextInt();
		sc.close();
		long[][] A = new long[N+1][N+1];


		for(int i = 2 ; i <= N ; i++){
			int p = i;
			for(int j = 2 ; j <= i ; j++){
				while(p%j == 0){
					p = p/j;
					A[i][j]++;
				}
			}
		}

/*
		for(int i = 1 ; i <= N ; i++){
			for(int j = 1 ; j <= N ; j++){
				System.out.print(A[i][j] + " ");
			}
			System.out.println("");
		}
*/
		long ans = 1;
		long inf = 1000000007;
		for(int i = 1 ; i <= N ; i++){
			long pp = 0;
			for(int j = 1 ; j <= N ; j++){
				pp+=A[j][i];
			}
			//System.out.println(pp);
			ans =(ans * (pp+1))%inf;
		}

		long ans2 = ans%inf;
		System.out.println(ans2);
	}
}
