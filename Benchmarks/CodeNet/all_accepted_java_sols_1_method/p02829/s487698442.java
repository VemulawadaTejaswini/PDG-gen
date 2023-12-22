import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		if (A * B == 2) {
			System.out.print(3);
		} else if (A * B == 3) {
			System.out.print(2);
		} else if (A * B == 6) {
			System.out.print(1);
		}
	}
}