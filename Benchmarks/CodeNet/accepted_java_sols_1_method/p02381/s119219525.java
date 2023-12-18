import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class Main {

	public static void main(String[] args) {
		Queue<Double> point = new LinkedList<Double>();
		try (Scanner sc = new Scanner (System.in)){
			while (true) {
				int n = sc.nextInt();
				if (n == 0) break;

				double[] score = new double[n];
				double avg = 0;

				for (int i=0; i<n; i++) {
					score[i] = sc.nextInt();
					avg += score[i];  //total
				}

				avg /= n;  //平均値

				double sd = 0;

				for (int i=0; i<n; i++) {
					sd += Math.pow((score[i]-avg), 2);
				}
				sd /= n;
				sd = Math.sqrt(sd);

				point.add(sd);
			}
			int b = point.size();
			for (int i=0; i<b; i++) System.out.printf("%.8f\n", point.remove());
		}
	}
}

