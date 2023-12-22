import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = Integer.parseInt(a+""+b);
		int d = (int) Math.sqrt(c);
		if (d*d == c) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
		sc.close();
	}

}