import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long N = Long.parseLong(sc.next());
		long A = Long.parseLong(sc.next());
		long B = Long.parseLong(sc.next());
		sc.close();
		
		long block = A + B;
		long loop = N / block;
		long rest = N % block;
		if(A <= rest) {
			long ans = loop * A + A;
			System.out.println(ans);
			return;
		}else {
			long ans = loop * A + rest;
			System.out.println(ans);
			return;
		}
	}
}