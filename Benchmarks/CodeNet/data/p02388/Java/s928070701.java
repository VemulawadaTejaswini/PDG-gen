import java.util.Scanner;

public class Cube {
	public static void main(String[] args) {
		int x;

		Scanner sc = new Scanner(System.in);
		x = sc.nextInt();
		System.out.println(x*x*x);

		sc.close();
	}

}