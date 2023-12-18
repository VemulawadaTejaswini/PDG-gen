import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long X = sc.nextLong();
		long K = sc.nextLong();
		long D = sc.nextLong();

		long minVal;
		if(D * K <= Math.abs(X)) {
			minVal = Math.abs(X) - D * K;
		}else {
			int n = 0;
			while(Math.abs(X) - D * n > 0) {
				n++;
			}

			if((K-n)%2==0) {
				minVal = Math.abs(Math.abs(X) - D * n);
			}else {
				minVal = Math.abs(Math.abs(X) - D * (n-1));
			}

		}

		System.out.println(minVal);

	}

}
