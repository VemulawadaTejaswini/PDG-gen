import java.util.Scanner;

public class Main {
	
	public static final int MAX = 20;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		final int N = sc.nextInt();
		int[] array = new int[N];
		
		for(int i = 0; i < N; i++){
			array[i] = sc.nextInt();
		}
		
		long[][] DP = new long[N][MAX + 1];
		
		DP[0][array[0]] = 1L;
		
		for(int i = 0; i < N - 1; i++){
			for(int number = 0; number <= MAX; number++){
				if(DP[i][number] > 0){
					if(number + array[i + 1] <= 20){
						DP[i + 1][number + array[i + 1]] += DP[i][number]; 
					}
					
					if(number - array[i + 1] >= 0){
						DP[i + 1][number - array[i + 1]] += DP[i][number]; 
					}
				}
			}
		}
		
		System.out.println(DP[N - 2][array[N - 1]]);
	}

}