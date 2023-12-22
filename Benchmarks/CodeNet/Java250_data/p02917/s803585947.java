import java.util.Scanner;

public class Main{
	
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);

		// input
		final int NUM = scan.nextInt();
		int[] answer = new int[NUM];
		for(int i = 0; i < NUM; i++){	// init
			answer[i] = Integer.MAX_VALUE;
		}
		for(int i = 0; i < NUM -1; i++){
			int temp = scan.nextInt();
			if(temp < answer[i]){
				answer[i] = temp;
			}
			if(temp < answer[i+1]){
				answer[i+1] = temp;
			}
		}
		
		// sum
		int sum = 0;
		for(int i = 0; i < NUM; i++){
			sum += answer[i];
		}
		
		// answer
		System.out.println(sum);
		
	}
}