import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sum = 0;


		do {
			sum = 0;
			long n = sc.nextLong();


			if(n == 0) {
				break;
			}

			long tmp = n;

			while (tmp > 0) {
				sum += tmp % 10;
				tmp /= 10;
			}

			System.out.println(sum);
		}while(true);

		sc.close();

	}

}
