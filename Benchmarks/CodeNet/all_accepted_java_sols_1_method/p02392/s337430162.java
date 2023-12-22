import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanNum = new Scanner(System.in);
		int a = scanNum.nextInt();
		int b = scanNum.nextInt();
		int c = scanNum.nextInt();
		if (a<b && b<c) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}
}