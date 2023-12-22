import java.util.*;
class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int K = sc.nextInt();
		for (int i = 0; i < K; i++) {
			if (A + i <= B) {
				System.out.println(A + i);
			}
		}
		for (int j = K - 1; j >= 0; j--) {
			if (B - j > A + K - 1) {
				System.out.println(B - j);
			}
		}
	}
}