import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner stdIn = new Scanner(System.in);
		long X = stdIn.nextLong();
		long K = stdIn.nextLong();
		long D = stdIn.nextLong();
		
		X = Math.abs(X);
		
		long step = Math.min(K, X / D);
		K -= step;
		X -= step * D;
		
		if(K % 2 == 0) {
			System.out.println(X);
		}else {
			System.out.println(D - X);
		}
		
		
	}
}