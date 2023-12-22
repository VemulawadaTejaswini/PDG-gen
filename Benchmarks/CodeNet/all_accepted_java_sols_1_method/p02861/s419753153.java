import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan =new java.util.Scanner(System.in);
		int n = scan.nextInt();
		int k = 0;
		double count = 0;
		double[][] xy = new double[n][2];
		for(int i=0;i< n ;i++) {
			xy[i][0] = scan.nextDouble();
			xy[i][1] = scan.nextDouble();
		}

		for(int i = 0 ; i < n;i++) {
			for (int j = i + 1 ; j < n; j++){
				double x_len = xy[i][0]-xy[j][0];
				double y_len =xy[i][1] -xy[j][1];
				count = count+Math.pow(x_len*x_len + y_len*y_len,0.5);
				k++;
			}
		}

		System.out.println((n-1)*(count/k));
	}

}
