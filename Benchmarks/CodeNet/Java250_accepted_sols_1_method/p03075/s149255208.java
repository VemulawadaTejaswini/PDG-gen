import java.util.Scanner;

class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		sc.nextInt();
		sc.nextInt();
		sc.nextInt();
		int e = sc.nextInt();
		int k = sc.nextInt();

		String ans = e - a > k ? ":(" : "Yay!";

		System.out.println(ans);

		sc.close();
	}
}
