import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		int K = sc.nextInt();
		for(int i = 0; i <= K; i++) {
			for(int j = 0; j <= K - i; j++) {
				if(A < B * Math.pow(2, i) && B * Math.pow(2, i) < C * Math.pow(2, j)) {
					System.out.println("Yes");
					return;
				}
			}
		}
		System.out.println("No");
	}

}