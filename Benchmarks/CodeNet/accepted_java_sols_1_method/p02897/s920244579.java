import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		double n = sc.nextDouble();
		double out = 0;

		if(n % 2 == 0) {
			out = 0.5;
		}else {
			double i = Math.ceil(n/2);
			out = i / n;
		}

		sc.close();
		System.out.println(out);

	}
}