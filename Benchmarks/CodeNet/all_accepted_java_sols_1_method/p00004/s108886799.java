import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()) {
			double[] A = new double[6];
			for(int i = 0; i < 6; i++) {
				A[i] = Double.parseDouble(sc.next());
			}

			double[] B = A.clone();

			double a = A[3];
			double b = A[0];
			for(int j = 0; j < 3; j++) {
				B[j] *= a;
				B[j + 3] *= b;
			}

			double y = (B[5] - B[2]) / (B[4] - B[1]);
			double x = (A[2] - A[1] * y) / A[0];

			if(x == 0) {
				x = 0;
			}
			if(y == 0) {
				y = 0;
			}

			System.out.printf("%.3f %.3f\n", x, y);
		}
		sc.close();
	}

}

