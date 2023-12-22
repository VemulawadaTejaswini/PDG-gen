import java.util.*;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

        double n = sc.nextInt();
		double k = sc.nextInt();
		
		double rate = 0;
		int score = 0;

		for (int i = 0; i < n; i++) {
			score = i + 1;
			if (score < k) {
				int count = 0;
				while (score < k) {
					count++;
					score *= 2;
				}
				rate += (1/n) * Math.pow(0.5, count);
			} else {
				rate += 1 / n;
			}
		}

		System.out.println(rate);
	}
}