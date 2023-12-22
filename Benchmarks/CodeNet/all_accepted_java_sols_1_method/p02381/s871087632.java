import java.util.Scanner;

public class Main{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int score[] = new int[1000];
		double avg = 0.0;
		double a = 0.0;
		while(n != 0){
			avg = 0.0;
			a = 0.0;
			for(int i = 0; i < n; i++){
				score[i] = sc.nextInt();
				avg += (double)score[i];
			}
			avg /= (double)n;
			for(int i = 0; i < n; i++){
				a += (score[i] - avg) * (score[i] - avg);
			}
			a = Math.sqrt(a/(double)n);
			System.out.println(a);
			n = sc.nextInt();
		}
	}
}