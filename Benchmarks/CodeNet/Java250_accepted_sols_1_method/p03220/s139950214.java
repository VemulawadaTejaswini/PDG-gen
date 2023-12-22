import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int T = sc.nextInt();
		int A = sc.nextInt();
		int[] H = new int[N];
		double min = 10000000;
		int a = 0;
		for(int i=0; i<N; i++) {
			H[i] = sc.nextInt();
		}
		sc.close();
		for(int i=0; i<N; i++) {
			double d = Math.abs(A - (T - H[i] * 0.006));
		      if (min > d) {
		        min = d;
		        a = i+1;
		      }
		}
		System.out.println(a);
	}

}