import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		int K = sc.nextInt();
		int max;
		if(A < B) {
			max = A;
			A = B;
			B = max;
		}
		if(A < C) {
			max = A;
			A = C;
			C = max;
		}
		for(int i = 0;i < K;i++) {
			A = A * 2;
		}
		System.out.println(A+B+C);
		sc.close();
	}
}