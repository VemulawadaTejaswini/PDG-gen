import java.util.Scanner;


public class Main {

	static long dp[][];
	static Scanner sc;
	static int num;
	static int[] array;	
	
	public static void main(String[] args) {
	
		new Main();
	
	}
	
	Main(){
		sc = new Scanner(System.in);
		num = sc.nextInt();
		array = new int[num];
		
		for(int i=0; i<num; i++){
			array[i] = sc.nextInt();
		}
		
		dp = new long[num][21];
		
		dp[0][array[0]] =1;
		
		for(int i=1; i<num-1; i++){
			for(int j=0; j<21; j++){
				if(j+array[i]<21)
					dp[i][j+array[i]] = dp[i][j+array[i]]+dp[i-1][j];
				if(j-array[i]>=0){
					dp[i][j-array[i]] = dp[i][j-array[i]]+dp[i-1][j];
				}
			}
		}
		System.out.println(dp[num-2][array[num-1]]);
	}
}