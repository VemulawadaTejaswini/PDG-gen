import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int D = sc.nextInt();
		double[] X = new double[N];
		double[] Y = new double[N];
		int s = 0;
		double a = 0;
		for(int i=0; i<N; i++) {
			X[i] = sc.nextInt();
			Y[i] = sc.nextInt();
		}
		for(int i=0; i<N; i++) {
			a = Math.sqrt(Math.pow(X[i],2)+Math.pow(Y[i],2));
			if(a<=D) {
				s++;
			}
		}
		sc.close();
		System.out.println(s);
	}

}