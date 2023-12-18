import java.util.Scanner;

public class Main {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int dataSet = sc.nextInt();

		for(int $ = 0; $ < dataSet; $++) {
			double[] numbers = new double[8];
			for(int i = 0; i < 8; i++) {
				numbers[i] = sc.nextDouble();
			}

			//???????±???????
			double ab = (numbers[0] - numbers[2]) * (numbers[1] - numbers[3]);
			double cd = (numbers[4] - numbers[6]) * (numbers[5] - numbers[7]);

			if(ab == cd) {
				System.out.println("YES");
			} else {
				System.out.println("NO");
			}
		}
	}

}