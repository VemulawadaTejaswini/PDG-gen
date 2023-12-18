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
			if(position <= 0) {
				position += D;
			}else {
				position -= D;
			}
			ans = Math.min(ans, Math.abs(position));
			K --;
			if(ans != Math.abs(position)) {
				break;
			}
		}
		
		if(K % 2 != 0) {
			if(position < 0) {
				ans = position + D;
			}else if(0 < position) {
				ans = position - D;
			}
		}
		System.out.println(ans);
	}
}