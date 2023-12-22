
import java.util.Scanner;


public class Main {
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int N = s.nextInt();
		int[][] A = new int[2][N];
		for(int i = 0;i < 2;i++){
			for(int j = 0;j < N;j++){
				A[i][j] = s.nextInt();
			}
				
		}
		
		int max = 0;
		for(int i = 0;i < N;i++){
			int count = 0;
			for(int j = 0;j <= i;j++){
				count += A[0][j];
			}
			for(int j = i;j < N;j++){
				count += A[1][j];
			}
			max = Math.max(max, count);
		}
		
		System.out.println(max);
	}
	
}