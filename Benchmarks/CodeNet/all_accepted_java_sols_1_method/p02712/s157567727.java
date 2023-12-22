import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int N = scan.nextInt();
		long num = 0;

		for(int i = 1; i < N+1; i++) {
			if (i % 3 != 0 && i % 5 != 0) {
				num += i;
			}
		}

		System.out.println(num);
	}

}