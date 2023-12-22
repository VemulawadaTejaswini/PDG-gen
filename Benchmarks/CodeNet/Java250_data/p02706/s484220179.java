import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner stdIn = new Scanner(System.in);
		int N = stdIn.nextInt();
		int M = stdIn.nextInt();
		int[] A = new int[M];
		for(int i = 0; i < M; i ++) {
			A[i] = stdIn.nextInt();
		}
		for(int i = 0; i < A.length; i ++) {
			N -= A[i];
		}
		if(0 <= N) {
			System.out.println(N);
		}else {
			System.out.println("-1");
		}
	}
}