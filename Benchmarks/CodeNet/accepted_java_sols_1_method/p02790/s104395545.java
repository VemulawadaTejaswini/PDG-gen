import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();

		StringBuilder sb1 = new StringBuilder();
		StringBuilder sb2 = new StringBuilder();

		for (int i = 0; i < a; i++) {
			sb1.append(b);

		}

		for (int i = 0; i < b; i++) {
			sb2.append(a);
		}

		if (sb1.toString().compareTo(sb2.toString()) < 0) {
			System.out.println(sb1);
		} else {
			System.out.println(sb2);
		}

	}
}
