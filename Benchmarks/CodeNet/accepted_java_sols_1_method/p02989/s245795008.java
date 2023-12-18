import java.util.Arrays;
import java.util.Scanner;

public class Main {
public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in); 
		
		int N  = keyboard.nextInt();
		int[]score = new int[N];
		
		for(int i = 0; i< N; i++) {
			score[i] = keyboard.nextInt();
		}
		Arrays.sort(score);
		int ans = 0;

		if(score[N/2] == score[N/2-1]) {
			ans = 0;
		}else{
			ans = score[N/2] - score[N/2-1];
		}

		System.out.print(ans);
		keyboard.close();	
	}
}
