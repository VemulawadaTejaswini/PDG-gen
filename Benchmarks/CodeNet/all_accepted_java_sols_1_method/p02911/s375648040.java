import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int K = sc.nextInt();
		int Q = sc.nextInt();
		
		int[] point = new int[N];
		
		for(int i = 0 ; i < N ; i++) {
			point[i] = K - Q;
		}
		
		for(int i = 0 ; i < Q ; i++) {
			int A = sc.nextInt();
			point[A - 1]++;
		}
		
		for(int i = 0 ; i < N ; i++) {
			if (point[i] > 0) {
				System.out.println("Yes");
			} else {
				System.out.println("No");
			}
		}
		
	}

}
