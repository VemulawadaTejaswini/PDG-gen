import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int plus = a+b;
		int minus = a-b;
		int multi = a*b;
		int result = 0;
		if (plus > minus) {
			result = plus > multi ? plus : multi; 
		} else {
			result = minus > multi ? minus : multi;
		}
		System.out.println(result);
	}
}