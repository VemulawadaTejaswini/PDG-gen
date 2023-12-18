import java.util.Scanner;

public class Main {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) throws Exception {
		int a = sc.nextInt() + sc.nextInt() + sc.nextInt() + sc.nextInt();
		int b = sc.nextInt() + sc.nextInt() + sc.nextInt() + sc.nextInt();
		System.out.println(Math.max(a, b));
	}

}