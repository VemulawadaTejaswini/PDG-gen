import java.util.Scanner;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] A = new int[n];
		for( int i = 0; i < n; i++){
			A[i] = scan.nextInt();
		}
		int ans = 200;
		for (int i = 0; i < A.length; i++) {
			int a = A[i];
			int now = 0;
			while (a%2 == 0) {
				a /= 2;
				now++;
			}
			if (ans > now) {
				ans = now;
			}
		}
		System.out.println(ans);
	}

}
