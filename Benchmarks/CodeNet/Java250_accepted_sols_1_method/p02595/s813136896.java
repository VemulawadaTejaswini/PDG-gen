import java.util.*;
 
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int D = sc.nextInt();
		double[] X = new double[N];
		double[] Y = new double[N];
		int count = 0;

		for(int i = 0; i < N; i ++){
			X[i] = sc.nextInt();
			Y[i] = sc.nextInt();
			if(Math.sqrt(X[i] * X[i] + Y[i] * Y[i]) <= D){
				count ++;
			}
		}
		System.out.println(count);

	}
}