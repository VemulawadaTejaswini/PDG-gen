import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long X = sc.nextLong();
		long K = sc.nextLong();
		long D = sc.nextLong();
		if (X==0) {
			if (K%2==0) {
				System.out.println(0);
			} else {
				System.out.println(D);
			}
		} else if (X>0) {
			long t = X/D;
			if (K<=t) {
				System.out.println(X-K*D);
			} else {
				long temp = K-t;
				if (temp %2==0) {
					System.out.println(X-t*D);
				} else {
					System.out.println(Math.abs(X-(t+1)*D));
				}
			}
		} else {
			long t = X/D;
			if (K<=-t) {
				System.out.println(Math.abs(X+K*D));
			} else {
				long temp = K-t;
				if (temp %2==0) {
					System.out.println(Math.abs(X-t*D));
				} else {
					System.out.println(Math.abs(X-(t-1)*D));
				}
			}
		}
	}
}