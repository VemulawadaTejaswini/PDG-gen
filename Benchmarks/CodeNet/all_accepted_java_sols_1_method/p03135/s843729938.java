import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		double t = sc.nextInt();
		double x = sc.nextInt();

		System.out.println(t / x);

		sc.close();
	}

}
