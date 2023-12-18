import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int x = 0;
		int y = 0;
		x = 800*n;
		int z = n/15;
		y = z*200;
			System.out.println(x-y);
	}
}
