import java.util.Scanner;

class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		long N = Long.parseLong(sc.next());
		long A = Long.parseLong(sc.next());
		long B = Long.parseLong(sc.next());
//		String S = sc.next();
		if(A == 0) {
			System.out.println(0);
			return;
		}

		long block = A + B;
		long aa = N / block;
		long aaa = N % block;

		System.out.println(aa * A + Math.min(A,aaa));

	}
}
