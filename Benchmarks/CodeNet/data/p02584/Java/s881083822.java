import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner stdIn = new Scanner(System.in);
		long X = stdIn.nextLong();
		long K = stdIn.nextLong();
		long D = stdIn.nextLong();
		
		long position = X;
		long ans = Math.abs(X);
		
		while(0 < K) {
			if(X < 0) {
				position += D;
				K --;
			}else if (0 < X) {
				position -= D;
				K --;
			}else {
				break;
			}
			ans = Math.min(ans, Math.abs(position));
			if(ans != Math.abs(position)) {
				break;
			}
		}
		if(K % 2 == 0) {
			ans = Math.abs(position);
		}
		System.out.println(ans);
	}
}