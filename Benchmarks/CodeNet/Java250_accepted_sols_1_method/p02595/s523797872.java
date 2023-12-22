import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		long D = sc.nextInt();
		long[] X = new long[N];
		long[] Y = new long[N];
		for(int i = 0;i < N;i++) {
			X[i] = sc.nextInt();
			Y[i] = sc.nextInt();
		}
		sc.close();

		int result=0;
		for(int i = 0;i < N;i++) {
			if(Math.sqrt(D*D)>=Math.sqrt(X[i]*X[i]+Y[i]*Y[i])) {
				result++;
			}
		}
		System.out.println(result);
	}

}
