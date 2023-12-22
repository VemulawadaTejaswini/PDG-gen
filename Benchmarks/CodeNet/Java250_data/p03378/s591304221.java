import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		int X = sc.nextInt();
		int[] A = new int[M];
		for(int i = 0; i < M; i++) {
			A[i] = sc.nextInt();
		}
		for(int i = 0; i < M - 1; i++) {
			if(X < A[0] || X > A[M - 1]) {
				System.out.println(0);
				break;
			}
			if(X > A[i] && X < A[i+1]) {
				if(i < (M / 2)) {
					System.out.println(i + 1);
					break;
				}else if(i == (M / 2)){
					System.out.println(Math.min(i + 1, M - (i + 1)));
					break;
				}else{
					System.out.println(M - (i + 1));
					break;
				}
			}
		}
		sc.close();
	}

}
