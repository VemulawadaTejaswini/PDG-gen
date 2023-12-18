import java.util.Scanner;
import java.lang.Math;
import java.util.Random;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);


		while(true){
			int n = sc.nextInt();
			if(n==0){ break;}
			int[] scores = new int[n];
			for(int i=0; i<scores.length; i++){
				scores[i] = sc.nextInt();
			}
			double sum = 0,average = 0, variance = 0;
			double m = (double)sum / n;
			for(int i=0; i<n; i++){
				sum += scores[i];
			}
			average = sum / scores.length;
			for(int i=0; i<n; i++){
				variance += Math.pow(scores[i]-average, 2);
			}
			variance /= n;
			double a = Math.sqrt(variance);

			System.out.println(Math.sqrt(variance));	
		}
	}
}