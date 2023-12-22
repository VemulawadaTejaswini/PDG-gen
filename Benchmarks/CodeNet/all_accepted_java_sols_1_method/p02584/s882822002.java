import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		long X = Math.abs(sc.nextLong());
		long K = sc.nextLong();
		long D = sc.nextLong();

		long minX;
		long maxX;
		long minK = X / D;

		if(X % D > Math.abs((X % D) - D)) {
			minX = Math.abs((X % D) - D);
			maxX = X % D;
			minK++;
		}else {
			minX = X % D;
			maxX = Math.abs((X % D) - D);
		}

		if(minK >= K) {
			System.out.println(Math.abs(X- (D * K)));
			return;
		}

		if((K-minK)%2 == 0) {
			System.out.println(minX);
		}else {
			System.out.println(maxX);
		}

	}

}