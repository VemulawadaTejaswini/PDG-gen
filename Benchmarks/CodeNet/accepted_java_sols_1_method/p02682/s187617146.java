import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int A = scan.nextInt();
		int B = scan.nextInt();
		int C = scan.nextInt();
		int K = scan.nextInt();
		int ans = 0;

		if (A <= K){
			ans += A * 1;
		}
		if (K < A){
			ans += K * 1;
		}
		if ((K - A - B) > 0){
			ans -= (K - A - B) * 1;
		}
		System.out.println(ans);
	}
}