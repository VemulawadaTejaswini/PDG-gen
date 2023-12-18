import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true) {
			int n = sc.nextInt();
			if (n == 0) {break;}
			int[] scores = new int[n];
			for(int i = 0; i < scores.length; i++) {
				scores[i] = sc.nextInt();
			}
			double add = 0, adda = 0, average = 0, variance = 0;
			for(int j = 0; j < scores.length; j++) {
				add = add + scores[j];
			}
			average = add / n;
			for(int k = 0; k < scores.length; k++) {
				adda = adda + (scores[k] - average) * (scores[k] - average);
				variance = adda / n;
			}
			System.out.println(Math.sqrt(variance));
		}
	}
}