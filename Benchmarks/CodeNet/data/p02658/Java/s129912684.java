import java.util.*;
public class Main {
		public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in); 
		//input integer
		int N = sc.nextInt();
		double A[] = new double[N];
		double result = 1;
		for(int i=0; i<N; i++) {
			A[i] = sc.nextDouble();
			result = result*A[i];
		}
		if(result>(Double)Math.pow(10, 18)) {result = -1;};
		System.out.println(Math.round(result));
		sc.close();
	}
}