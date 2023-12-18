import java.util.Scanner;


public class Main{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		float[] x = new float[6];
		float[] y = new float[2];
		for (int i = 0; i < x.length; i++) {
			x[i] = scan.nextFloat();
		}
		float det = x[0] * x[4] - x[1] * x[3];
		if (det != 0) {
			y[0] = (x[4] * x[2] - x[1] * x[5]) / det;
			y[1] = (x[0] * x[5] - x[2] * x[3]) / det;
		}
		System.out.printf("%.3f",y[0]);
		System.out.print(" ");
		System.out.printf("%.3f",y[1]);
		System.out.println();
	}

}