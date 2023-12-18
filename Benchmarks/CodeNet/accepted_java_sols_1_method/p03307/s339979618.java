import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		if(n % 2 == 0) {
			System.out.println(n);
			return;
		}
		else {
			System.out.println(2 * n);
		}
	}
}
