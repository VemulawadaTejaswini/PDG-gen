import java.util.Scanner;

public class Main {

	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		double[] nums = new double[6];

		while(sc.hasNext()) {
				for(int i = 0; i < nums.length; i++) {
					nums[i] = sc.nextDouble();
				}

			simuEqu(nums);
		}

		sc.close();
	}

	private static void simuEqu(double[] nums) {
		double a = nums[0]; /* x + */ double b = nums[1]; /* y = */ double c = nums[2];
		double d = nums[3]; /* x + */ double e = nums[4]; /* y = */ double f = nums[5];

		double x = ( c * e - f * b )/ ( a * e - b * d );

		double y = ( c - a * x ) / b;

		System.out.printf("%.3f %.3f\n",x ,y);
	}



}
