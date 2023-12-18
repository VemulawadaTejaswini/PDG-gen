import java.util.*;
public class Main {
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[][] A = new int[2][N];
		int[] sum = {0,0};
		int a = 0;
		for(int i=0;i<2;i++){
			for(int j = 0;j<N;j++){
				A[i][j] = sc.nextInt();
			}
		}
		for(int i=0;i<N;i++){
			for(int j=0;j<N;j++){
				if(i==j){
					sum[0] += A[a][j];
					a = 1;
				}
				sum[0] += A[a][j];
			}
			if(sum[1]<sum[0]){
				sum[1]=sum[0];
			}
			sum[0] = 0;
			a = 0;
		}
		System.out.print(sum[1]);
	}
}