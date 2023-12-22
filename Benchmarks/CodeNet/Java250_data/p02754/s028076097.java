import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long  N = sc.nextLong();
		long  A = sc.nextLong();
		long  B = sc.nextLong();
		long p = A + B;
		
		if(N%p <= A) {
			System.out.println(N/p*A + N%p);
		}else {
			System.out.println(N/p*A + A);
		}


	}
}
