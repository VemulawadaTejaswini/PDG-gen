import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		int N = sc.nextInt();
		int[] T = new int[N + 1];
		for(int i = 0; i < N; i++) {
			T[i] = sc.nextInt();	
		}
		int M = sc.nextInt();
		int[] P = new int [M];
		int[] X = new int [M];
		for(int i = 0; i < M; i++) {
			P[i] = sc.nextInt();
			X[i] = sc.nextInt();
		}
		int sum = 0;
		for(int i = 0; i < M; i++) {
			int a = P[i];
			T[N] = X[i];
			for(int j = 0; j < T.length; j++) {
				sum += T[j];
			}
			System.out.println(sum - T[a - 1]);
			sum = 0;
		}
	}
}