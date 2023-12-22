import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int T = sc.nextInt();
		int A = sc.nextInt();
		int[] H = new int[N];
		double[] t = new double[N];
		double[] sa = new double[N];
		double min = Math.pow(10, 6);
		int num = 10000;
		
		for(int i = 0; i < N; i++) {
			H[i] = sc.nextInt();
			t[i] = T - H[i] * 0.006;
			sa[i] = Math.abs(A - t[i]);
			
			if(min > sa[i]) {
				num = i + 1;
				min = sa[i];
			}
		}
		
		System.out.println(num);
		
	}
}
