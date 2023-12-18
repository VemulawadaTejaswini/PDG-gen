import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();

		while (true){
		int a = sc.nextInt();
		int b = sc.nextInt();

			if (a == 0 && b == 0)break;
		if (a < b) {
			System.out.println(a + " " + b);
		} else if (a > b) {
			System.out.println(b + " " + a);
		}
	}
}
}
