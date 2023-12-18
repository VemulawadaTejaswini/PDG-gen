import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		long X = sc.nextLong();
		long K = sc.nextLong();
		long D = sc.nextLong();
		sc.close();

		long answer = 0L;
		if(X == 0L){
			if(K % 2L == 0L){
				answer = 0L;
			} else {
				answer = D;
			}
		} else {
			if(X < 0L){
				X *= -1L;
			}
			long quotient = X / D;
			if(K < quotient){
				answer = X - (K * D);
			} else {
				long mod = X % D;
				K -= quotient;
				if(K % 2L == 0L){
					answer = mod;
				} else {
					answer = Math.abs(mod - D);
				}
			}
		}
		System.out.println(answer);
	}

}