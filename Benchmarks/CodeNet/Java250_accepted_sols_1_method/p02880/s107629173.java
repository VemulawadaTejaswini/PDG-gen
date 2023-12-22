import java.util.Scanner;

public class Main{

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int n = Integer.parseInt(scanner.nextLine());

		boolean flag = false;

		for(int i = 1; i < 10; i++) {

			if(n % i == 0) {

				double temp = n / i;

				for(int j = 1; j < 10; j++) {

					if(temp / j == 1) {

						flag = true;
						break;

					}
				}
			}
		}


		if(flag) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
	}
}
