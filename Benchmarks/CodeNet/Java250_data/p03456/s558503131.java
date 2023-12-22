import java.util.Scanner;

public class Main {

	public static void main(String[] args) {


		Scanner sc = new Scanner(System.in);
		String a = sc.next();
		String b = sc.next();

		int number = Integer.parseInt(a + b);

		for(int i = 2; i*i <= number; i++) {
			if(i * i == number) {
				System.out.println("Yes");
				return;
			}
		}
		System.out.println("No");
	}
}