import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int a, b, mul;
		Scanner scanner = new Scanner(System.in);
		a = scanner.nextInt();
		b = scanner.nextInt();
		mul = a * b;
		if(mul % 2 == 0) {
			System.out.println("No\n");
		}else
			System.out.println("Yes\n");
	}

}
