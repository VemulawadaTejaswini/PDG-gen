import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int half = sc.nextInt();
		sc.close();

		System.out.print((float) 2 * half * 3.14);
	}

}
