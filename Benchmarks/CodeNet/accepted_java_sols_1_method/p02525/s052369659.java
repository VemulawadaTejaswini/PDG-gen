import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		while(true){
			int n = sc.nextInt();
			if(n==0) {break;}
			int[] scores = new int[n];
			for(int i=0; i<scores.length; i++){
				scores[i] = sc.nextInt();
			}
			double ave = 0, var = 0;
			
			for(int i=0; i<scores.length; i++){
				ave += scores[i];
			}
			ave = ave / n;
			
			for(int i=0; i<n; i++){
				var += (scores[i] - ave)*(scores[i] - ave);
			}
			var = var / n;
			
			System.out.println(Math.sqrt(var));
			
			
		}
	}
}