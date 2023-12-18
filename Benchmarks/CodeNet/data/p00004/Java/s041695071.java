import java.util.Scanner;


public class Main{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		float[] x = new float[6];
		float[] y = new float[2];
		while(scan.hasNext()){
		for (int i = 0; i < x.length; i++) {
			x[i] = scan.nextFloat();
		}
		float det = x[0] * x[4] - x[1] * x[3];
			y[0] = (x[4] * x[2] - x[1] * x[5]) / det;
			y[1] = (x[0] * x[5] - x[2] * x[3]) / det;
		System.out.printf("%.3f %.3f\n",y[0],y[1]);
		}
	}

}