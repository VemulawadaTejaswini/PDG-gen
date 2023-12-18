import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int num = sc.nextInt();
		String str;
		String head = "";

		for (int i = 0; i < num; i++) {
			if (i == 0) {
				head = sc.next();
			}
			if (i != 0) {
				str = sc.next();
				if (str.compareTo(head) < 0) {
					head = str;
				}
			}
		}
		System.out.println(head.charAt(0));
	}
}