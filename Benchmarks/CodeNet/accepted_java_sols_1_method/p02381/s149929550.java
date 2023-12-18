import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		try(Scanner sc = new Scanner(System.in)){
			while(true){
				int n = sc.nextInt();
				if(n == 0){
					break;
				}
				int[] scores = new int[n];
				double average = 0;
				for(int i = 0;i < scores.length;i++){
					scores[i] = sc.nextInt();
					average += (double)scores[i];
				}
				average = average / scores.length;
				double variance = 0;
				for(int j = 0;j < scores.length;j++){
					variance += ((scores[j]-average)*(scores[j]-average));
				}
				System.out.println(Math.sqrt(variance/scores.length));
			}
		}
	}
}
