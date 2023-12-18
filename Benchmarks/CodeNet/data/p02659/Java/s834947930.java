import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long A = Long.parseLong(sc.next());
		double B = Double.parseDouble(sc.next());
		sc.close();

		double c = B - Math.floor(B);
		double check = Math.floor(A * B);
		long ans = (long) check;

		System.out.println(ans);
	}

}
