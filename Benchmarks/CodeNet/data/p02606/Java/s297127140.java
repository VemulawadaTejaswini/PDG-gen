import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int l = sc.nextInt();
		int r = sc.nextInt();
		int d = sc.nextInt();

		sc.close();

		int ldCount = (l != d) ? l / d : 0;
		int rdCount = r / d;

		System.out.println(rdCount - ldCount);
	}
}
