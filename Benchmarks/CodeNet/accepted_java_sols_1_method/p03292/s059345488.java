import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();

		if (Math.abs(a-b) >= Math.abs(a-c) && Math.abs(a-b) >= Math.abs(b-c)) {
			System.out.print(Math.abs(a-c) + Math.abs(b-c));
		} else if (Math.abs(b-c) >= Math.abs(a-b) && Math.abs(b-c) >= Math.abs(a-c)) {
			System.out.print(Math.abs(a-c) + Math.abs(a-b));
		}else {
			System.out.print(Math.abs(a-b) + Math.abs(b-c));
		}
	}
}