import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		long num = sc.nextInt();
		long total = 1;

		for(int i = 1; i <= num; i++){

			total *= i;
		}

		System.out.println(total);
	}

}