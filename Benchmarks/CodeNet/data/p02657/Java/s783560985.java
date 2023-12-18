import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		int value1 = scan.nextInt();
		int value2 = scan.nextInt();
		int sum = value1 * value2;
		scan.close();
		System.out.println(sum);
	}

}
