import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		long n = scan.nextLong();
		long a = scan.nextLong();
		long b = scan.nextLong();

		long sum = n / (a + b) * a;
		long remain = n % (a+b);

		if(remain < a) {
			sum += remain;
		}else {
			sum += a;
		}
		System.out.println(sum);
		scan.close();
	}

}
