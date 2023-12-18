import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x;
		x = sc.nextInt();
		while (true) {
			if (x >= 1 && x <= 100) {
				System.out.println(x * x * x);
				break;
			} else {
				continue;
			} 
		}
		sc.close();
	}
}