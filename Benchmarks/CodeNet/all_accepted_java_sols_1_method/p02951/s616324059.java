import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();

		System.out.println(a-b>c ? 0: c-(a-b));

//		if (a-b > c) {
//			System.out.println(0);
//		} else {
//			System.out.println(c-(a-b));
//		}
	}
}