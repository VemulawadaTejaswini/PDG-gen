import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner stdin = new Scanner(System.in);
		int studentNum = 3;
		int[] acanum = new int[studentNum];
		double[] w = new double[studentNum];
		double[] h = new double[studentNum];
		double[] bmi = new double[studentNum];
		for(int i = 0; i < studentNum; i++) {
			acanum[i] = stdin.nextInt();
			w[i] = stdin.nextDouble();
			h[i] = stdin.nextDouble();
			bmi[i] = w[i] / (h[i] * h[i]);
		}
		
		for(int i = 0; i < studentNum; i++) {
			if(bmi[i] >= 25) {
				System.out.println(acanum[i]);
			}
			
			
		}
		

	
	}

}