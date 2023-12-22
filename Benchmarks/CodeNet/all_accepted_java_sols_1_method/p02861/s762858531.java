import java.util.*;

public class Main{
	
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);

		// input
		final int NUM = scan.nextInt();
		int[][] pos = new int[NUM][2];
		for(int i = 0; i < NUM; i++){
			pos[i][0] = scan.nextInt();
			pos[i][1] = scan.nextInt();
		}
		
		// search
		double sum = 0.0;
		int count = 0;
		for(int i = 0; i < NUM; i++){
			for(int j = 0; j < NUM; j++){
				if(i == j){
					continue;
				}
				sum += Math.sqrt(Math.pow(pos[i][0] - pos[j][0], 2) + Math.pow(pos[i][1] - pos[j][1], 2));
				count++;
			}
		}
		double avg = sum / (double)count;
		
		// answer
		System.out.println(avg * (NUM-1));
		
	}
}