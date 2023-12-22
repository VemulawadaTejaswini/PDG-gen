import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int c = scanner.nextInt();
		int d = scanner.nextInt();

		int AB = Math.abs(a-b);
		int AC = Math.abs(a-c);
		int BC = Math.abs(b-c);

		//AとCが直接会話可能または、AとBが直接会話可能かつBとCが直接会話可能
		if (AC <= d || (AB <= d && BC <= d)) {
			System.out.println("Yes");

		//AとCが会話不可能
		} else {
			System.out.println("No");
		}
	}
}