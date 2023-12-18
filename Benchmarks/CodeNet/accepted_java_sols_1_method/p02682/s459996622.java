import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		int K = sc.nextInt();
		long R = 0;
		if(A + B >= K){
			R = Math.min(K, A);
		}else{ // A + B < K
			R = A;
			K -= A + B;
			R -= K;
		}
		System.out.println(R);
	}	
}
