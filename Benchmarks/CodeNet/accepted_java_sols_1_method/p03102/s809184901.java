import java.util.Scanner;


public  class Main  {


	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		int C = sc.nextInt();
		int B[] = new int[M];
		int A[][] = new int [N][M];
		int counter =0;
		for(int i=0; i<M;i++) {
			B[i] = sc.nextInt();
		}
		for(int i = 0; i<N; i++) {
			for(int j = 0; j<M; j++) {
				A[i][j] = sc.nextInt();
			}
		}
		
		for(int i =0; i<N; i++) {
			int sum =0;
			for(int j = 0; j<M; j++) {
				int K = A[i][j]*B[j];
				sum+=K;
			}
			sum+=C;
			if(sum>0)counter++;
		}
		System.out.println(counter);
		
		
		
		
	}}