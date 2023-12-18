import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		String str = sc.next();

		if (num < 3200) {
			str = "red";
		}
		System.out.println(str);
		sc.close();
	}
}
