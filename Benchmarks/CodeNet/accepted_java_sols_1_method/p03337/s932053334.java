import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int AB1 = A + B;
		int AB2 = A - B;
		int AB3 = A * B;
		if (AB3 > AB2 && AB3 > AB1) {
			System.out.println(AB3);
		} else if (AB2 > AB3 && AB2 > AB1) {
			System.out.println(AB2);
		} else {
			System.out.println(AB1);
		}
	}
}