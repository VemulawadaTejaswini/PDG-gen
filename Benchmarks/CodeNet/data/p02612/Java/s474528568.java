
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		int s=1000;

		while(s<n) {
			s += 1000;
		}

		System.out.println(s-n);

		sc.close();

	}

}
