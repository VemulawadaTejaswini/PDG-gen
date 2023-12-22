import java.util.Scanner;

public class Main{

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		String[] tmp = scanner.nextLine().split(" ");
		int l = Integer.parseInt(tmp[0]);
		int r = Integer.parseInt(tmp[1]) + 1;
		int d = Integer.parseInt(tmp[2]);
		int a = 0;


		for(int i = l; i < r; i++) {

			a += i % d == 0 ? 1 : 0;

		}

		System.out.println(a);
	}
}
