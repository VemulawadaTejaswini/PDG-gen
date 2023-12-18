import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO ?????????????????????????????????????????????
		Scanner stdin = new Scanner(System.in);
		int[] number = new int[5];
		double[] height = new double[5];
		double[] weight = new double[5];
		double bmi;
		for(int i = 0; i < 5; i++) {
		 number[i] =stdin.nextInt();
		 weight[i] = stdin.nextDouble();
		 height[i] = stdin.nextDouble();

		 bmi = (weight[i] / (Math.pow(height[i], 2)));

		 if(bmi >= 25) {
			 System.out.println(number[i]);
		 }
		}
	}

}