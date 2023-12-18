import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);

		for(int i=1; ; i++) {
			int x = scan.nextInt();

			if(x == 0)
				break;

			System.out.println(String.format("Case %d: %d", i, x));
		}
	}
}

