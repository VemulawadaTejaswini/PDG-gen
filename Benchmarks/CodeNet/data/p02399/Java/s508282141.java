import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		double c = sc.nextInt();
		c = a/b;
		sc.close();

		System.out.println(a/b + " " + a%b +" " + c);
	}

}