import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		sc.close();

		int result = -1;
		if (String.valueOf(a).length() == 1 && String.valueOf(b).length() == 1) {
			result = a * b;
		}
		System.out.println(result);
	}
}
