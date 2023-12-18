import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = 1;
		byte[] score = new byte[1000];
		double[] calc = new double[1000];
		double[] result = new double[1000];
		long sum = 0;
		double sum2 = 0.;
		double avg = 0;
		int count = 0;
		while (n > 0){
			n = sc.nextInt();
			sum = 0;
			for (int i = 0; i < score.length; i++) {
				score[i] = 0;
				calc[i] = 0.;
			}
			if(n <= 0){
				break;
			}else{
				for (int i = 0; i < n; i++) {
					score[i] = sc.nextByte();
					sum += score[i];
				}
				avg = (double) sum / (double) n;
				sum2 = 0;
				for (int i = 0; i < n; i++) {
					calc[i] = Math.pow((double)score[i] - avg, 2);
					sum2 += calc[i];
				}
				avg = (double) sum2 / (double) n;
				result[count++] = Math.sqrt(avg);
			}
		}
		for (int i = 0; i < count; i++) {
			System.out.printf("%.16f\n", result[i]);
		}
	}
}

