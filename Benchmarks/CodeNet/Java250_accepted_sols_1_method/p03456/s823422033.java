import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();

		String abString = String.valueOf(a) + String.valueOf(b);
		int abInt = Integer.parseInt(abString);
		String result = "No";

		for (int i = 1 ; i <= abInt; i++) {
			if (i * i == abInt) {
				result = "Yes";
				break;
			}
		}
		System.out.println(result);

	}
}

