import java.util.*;
public class Main{
	public static void main(String[] arugs){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		double[] A = new double[N];
		double ans = 0;
		double sum = 0;
		double result = 0;
		
		for(int i=0; i<N; i++){
			A[i] = sc.nextDouble();
		}
		
		for(int j=0; j<N; j++){
			ans = 1/A[j];
			sum += ans;
			ans = 0;
		}
		
		result = 1/sum;
		
		System.out.println(result);
	}
}
