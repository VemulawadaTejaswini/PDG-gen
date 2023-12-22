import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int N = stdIn.nextInt();
		int T = stdIn.nextInt();
		int A = stdIn.nextInt();
		double[] H = new double[N];
		H[0] = Math.abs(T - stdIn.nextDouble()*0.006 - A);
		double min = H[0];
		int ans = 0;
		for(int i = 1; i < N; i++) {
			H[i] = Math.abs(T - stdIn.nextDouble()*0.006 - A);
			if(H[i] < min) {
				min = H[i];
				ans = i;
			}
		}
		System.out.println(ans+1);

	}

}