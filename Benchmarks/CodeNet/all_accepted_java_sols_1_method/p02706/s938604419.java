import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		int N = stdIn.nextInt();
		int M = stdIn.nextInt();
		int[] A = new int[M];
		for(int a = 0; a < M; a++){
			A[a] = stdIn.nextInt();
			N = N - A[a];
		}
		if(N >= 0){
			System.out.println(N);
		}
		else{
			System.out.println(-1);
		}
		stdIn.close();
	}
}