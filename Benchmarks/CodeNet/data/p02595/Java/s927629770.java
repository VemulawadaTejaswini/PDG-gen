import java.util.Scanner;

public class Main{
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int D = sc.nextInt();
		double X[] = new double[N];
		double Y[] = new double[N];
		
		int a = 0;
		
		for (int i = 0; i < N; i++) {
			X[i] = sc.nextDouble();
			Y[i] = sc.nextDouble();
			
			double A =  Math.sqrt((X[i] * X[i]) + (Y[i] * Y[i]));
			
			if(A <= D)				a++;
		}
		
		System.out.println(a);
	}
}
