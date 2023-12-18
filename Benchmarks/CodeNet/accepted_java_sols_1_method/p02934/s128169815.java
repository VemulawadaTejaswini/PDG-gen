import java.util.*;

public class Main{
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		double[] d = new double[N];
		double ip = 1;
		for(int i = 0 ;i < N; i++) {
			d[i] = sc.nextDouble();
			ip *= d[i];
		}
		sc.close();
		
		double sum = 0;
		for(int i = 0 ;i < N; i++) {
			sum += ip / d[i];
		}
		System.out.println(ip/sum);
	}
}