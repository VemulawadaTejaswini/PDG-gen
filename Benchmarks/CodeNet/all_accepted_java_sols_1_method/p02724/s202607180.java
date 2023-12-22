import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int x = scan.nextInt();
		int y = x / 500;
		x %= 500;
		int z = x / 5;
		System.out.println(y * 1000 + z * 5);

	}

}
