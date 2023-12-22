import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		long N = Long.parseLong(scan.next());
		long A = Long.parseLong(scan.next());
		long B = Long.parseLong(scan.next());
		scan.close();

		long total = A + B;

		long shou = N / total;
		long amari = N % total;

		long AA = shou * A;
		if (amari <= A) {
			AA += amari;
		} else {
			AA += A;
		}

		System.out.println(AA);

	}

}