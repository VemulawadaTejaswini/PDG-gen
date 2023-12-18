import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		double[] x = new double[N];
		String[] u = new String[N];
		double a = 0;
		for(int i=0; i<N; i++) {
			x[i] = sc.nextDouble();
			u[i] = sc.next();
			if(u[i].contains("JPY")) {
				a += x[i];
			}else {
				a += x[i]*380000;
			}
		}
		sc.close();
		System.out.println(a);
	}

}