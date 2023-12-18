import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws Exception {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int primeNum = 0;

		for(int i = 0; i < n; i++) {

			int num = sc.nextInt();
			boolean isPrimeNum = true;

			for(int j = 2; j < num; j++) {

				if(num % j == 0) {

					isPrimeNum = false;
					break;
				}
			}

			if(isPrimeNum) {
				primeNum++;
			}

		}
		System.out.println(primeNum);
	}
}
