import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		int p = sc.nextInt();

		int pie = (a * 3 + p) / 2;

		System.out.println(pie);

		sc.close();
	}

}
