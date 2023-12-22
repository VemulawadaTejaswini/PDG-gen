import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int a = sc.nextInt();
		int b = sc.nextInt();

		int total = 0;

		for (int i=1; i<=n; i++){
			int sum = 0;;
			sum += i / 10000;
			sum += i % 10000 / 1000;
			sum += i % 1000 / 100;
			sum += i % 100 / 10;
			sum += i % 10;
			if (sum >= a && sum <= b){
				total += i;
			}
		}
		System.out.println(total);
	}
}
