
import java.util.Scanner; 

class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		double[] x = new double[4];
		double[] y = new double[4];
		int n = sc.nextInt();
		for(int i = 0; i < n; i++){
			for(int c = 0; c < 4; c++){
				x[c] = sc.nextDouble();
				y[c] = sc.nextDouble();
			}

			double a = (y[0] - y[1]) / (x[0] - x[1]);
			double b = (y[2] - y[3]) / (x[2] - x[3]);

			if(a == b) System.out.println("YES");
			else System.out.println("NO");
		}
	}
}