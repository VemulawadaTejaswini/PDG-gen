import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int[] T = new int[N];
		int total = 0;
		for(int i = 0;i<N; i++){
			T[i] = scan.nextInt();
			total += T[i];
		}
		int M = scan.nextInt();
		int[] P = new int[M];
		int[] X = new int[M];
		for(int i = 0;i<M;i++){
			P[i] = scan.nextInt();
		    X[i] = scan.nextInt();
		}
		for(int i = 0;i<M;i++){
			System.out.println(total + X[i] - T[P[i]-1]);
		}
		
		
		
	}
	

}