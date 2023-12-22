import java.util.*;

public class Main{
	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		int K = sc.nextInt();

		int result = Math.min(A, K) - Math.max(0, (K-(A + B)));
		
		System.out.println(result);
		sc.close();
	}
}