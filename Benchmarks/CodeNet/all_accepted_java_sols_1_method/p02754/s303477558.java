import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		long N = sc.nextLong();
		long A = sc.nextLong();
		long B = sc.nextLong();
		
		long loop = N / (A + B);
		long amari = N % (A + B);
		long blue;
		if (amari <= A){
			blue = amari;
		} else {
			blue = A;
		}
		
		System.out.println(loop * A + blue);
	}
}