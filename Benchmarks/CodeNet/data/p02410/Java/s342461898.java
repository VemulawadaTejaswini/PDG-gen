import java.util.*;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[][] A = new int[n][m];
		int[] b = new int[m];
		for(int i = 0; i<n; i++){
			for(int j = 0;j<m;j++){
				int number1 = sc.nextInt();
				 A[i][j] = number1;
			}
		}

		for(int i=0;i<m;i++){
			int number2 = sc.nextInt();
			b[i] = number2;
		}
		int result;
		for(int i = 0;i<n; i++){
		    result=0;
			for(int j = 0; j<m; j++){
				result += A[i][j] * b[j];
			}
		 System.out.printf("%d\n",result);
		}
	
	}
}
