import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Main main = new Main();
		main.run();
	}

	int N;
	int A[];
	public void run() {
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		A = new int[N];
		for(int i=0; i<N; i++) A[i] = sc.nextInt();
		Arrays.sort(A);

		int a = 0;
		int b = 0;
		for(int i=0; i<N; i++) {
			if(i%2==0) a += A[N-i-1];
			else b += A[N-i-1];
		}
		System.out.println(a-b);
		sc.close();
	}
}