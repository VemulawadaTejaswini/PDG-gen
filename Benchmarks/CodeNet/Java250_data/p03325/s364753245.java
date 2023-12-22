import java.util.Scanner;

public class Main {
	static public void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int count = 0;
		for (int i = 0; i < n; i++) {
			int a = scan.nextInt();
			while (a % 2 == 0) {
				count++;
				a = a / 2;
			}
		}
		scan.close();
		System.out.println(count);
	}
}
