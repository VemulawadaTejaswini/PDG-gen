import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long A = Long.parseLong(sc.next());
		double B = Double.parseDouble(sc.next());
		sc.close();

		long hunSum = (long) Math.floor(100 * B);
		System.out.println((A * hunSum) / 100 );
		
	}

}