import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		while(true){
			int n = sc.nextInt();
			if(n == 0){ break; }
			int[] scores = new int[n];
			double sum = 0;
			for(int i = 0; i < scores.length; i++){
				scores[i] = sc.nextInt();
				sum += scores[i];
			}
		double m = 0, var = 0, sum2 = 0;
		m = sum / n;

		for(int i = 0; i < n; i++){
			sum2 += (scores[i] - m) * (scores[i] - m);
		}
		var = sum2 / n;

		System.out.println(Math.sqrt(var));
		}
	}
}