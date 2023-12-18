import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		while(true){
			int n = sc.nextInt();
			if(n == 0) break;
			int[] scores = new int[n];
			for(int i = 0; i < scores.length; i++){
				scores[i] = sc.nextInt();
			}
			double ave = 0, var = 0, sum1 = 0, sum2 = 0;
			for(int i = 0; i < scores.length; i++){
				sum1 = sum1 + scores[i];
			}
			ave = sum1/scores.length;
			for(int i = 0; i < scores.length; i++){
				sum2 = sum2 + (scores[i] - ave)*(scores[i] - ave);
			}
			var = sum2/scores.length;
			System.out.println(Math.sqrt(var));
		}
	}
}