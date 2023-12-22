import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int chairLength  = sc.nextInt();
		int y = sc.nextInt();
		int z = sc.nextInt();

		System.out.println((chairLength - z) / (y + z));
	}

}
