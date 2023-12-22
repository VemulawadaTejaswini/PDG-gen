
import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();

		int[][] A = new int[N+1][3];
		for(int i = 1 ; i <= N ; i++){
			for(int j = 0 ; j < 3 ; j++){
				A[i][j] = sc.nextInt();
			}
		}

		A[0][0] = 0;
		A[0][1] = 0;
		A[0][2] = 0;

		sc.close();
		int count = 0;
		for(int i = 1 ; i <= N ; i++){
			int tmp = Math.abs(A[i][1]-A[i-1][1]) + Math.abs(A[i][2] - A[i-1][2]);
			int tmp2 = Math.abs(A[i][0]-A[i-1][0]);

			//System.out.println("tmp : " +tmp);
			//System.out.println("tmp2 : " +tmp2);

			if((tmp2%2 == tmp%2) && tmp2 >= tmp){
				count++;
			}
		}

		if(count == N){
			System.out.println("Yes");
		}
		else{
			System.out.println("No");
		}
	}
}