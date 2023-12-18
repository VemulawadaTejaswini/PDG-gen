import java.text.DecimalFormat;
import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		DecimalFormat df = new DecimalFormat("0.000");
		while (in.hasNext()) {
			double[][] A = new double[2][2];
			double[] b = new double[2];
			
			A[0][0] = in.nextInt();
			A[0][1] = in.nextInt();
			b[0] = in.nextInt();
			A[1][0] = in.nextInt();
			A[1][1] = in.nextInt();
			b[1] = in.nextInt();
			
			double[] x = gaussJordan(A, b);
			System.out.println(df.format(x[0])+" "+df.format(x[1]));
		}
	}

	// solve Ax=b
	static double[] gaussJordan(double[][] A, double[] b) {
		int n = A.length;
		double[][] B = new double[n][n+1];
		for (int i=0;i<n;i++) {
			for (int j=0;j<n;j++) {
				B[i][j] = A[i][j];
			}
			B[i][n] = b[i];
		}
		
		for (int v=0;v<n;v++) { // for each variable(column)
			// search for variable whose abs(coefficient) is max
			int pivot = v;
			for (int r=pivot;r<n;r++) {
				if (Math.abs(B[r][v])>Math.abs(B[pivot][v])) {
					pivot = r;
				}
			}
			
			swapRowD(B, v, pivot);
			for (int c=v+1;c<n+1;c++) {
				B[v][c] /= B[v][v];
			}
			for (int r=0;r<n;r++) {
				if (r==v) continue;
				for (int c=v+1;c<n+1;c++) {
					B[r][c] -= B[v][c]*B[r][v];
				}
			}
		}
		
		double[] res = new double[n];
		for (int i=0;i<n;i++) {
			res[i] = B[i][n];
		}
		return res;
	}
	
	static void swapRowD(double[][] A, int m, int n) {
		double[] tmp = A[m];
		A[m] = A[n];
		A[n] = tmp;
	}
}