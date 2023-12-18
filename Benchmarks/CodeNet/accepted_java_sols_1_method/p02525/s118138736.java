import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner stdin = new Scanner(System.in);
		int numData;
		double average;
		double variance;
		while (true) {
			numData = 0;
			average = variance = 0;
			try {
				numData = stdin.nextInt();
			} catch (Exception e) {
				e.printStackTrace();
				numData = 5;
			}
			if (numData == 0) {
				stdin.close();
				System.exit(0);
			}

			int[] in = new int[numData];
			for (int i = 0; i < numData; ++i) {
				try {
					in[i] = stdin.nextInt();
				} catch (Exception e) {
					e.printStackTrace();
					in[i] = 50;
				}
				average += in[i];
			}
			average /= numData;
			for (int i = 0; i < numData; ++i)
				variance += Math.pow(in[i] - average, 2);
			System.out.println(Math.sqrt(variance / numData));
		}
	}
}