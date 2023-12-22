import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		int N;
		
		Scanner sc = new Scanner(System.in);
		
		while(sc.hasNext()){
			N = sc.nextInt();
			
			if(N == 0)
				break;
			
			int[][] array = new int[N+1][N+1];
			
			for(int i = 0; i < N; i++){
				for(int j = 0; j < N; j++){
					array[i][j] = sc.nextInt();
					array[i][N] += array[i][j];
					array[N][j] += array[i][j];
					array[N][N] += array[i][j];
				}
			}
			
			for(int i = 0; i < N + 1; i++){
				for(int j = 0; j < N + 1; j++){
					System.out.printf("%5d",array[i][j]);
				}
				System.out.println();
			}
		}
	}
}