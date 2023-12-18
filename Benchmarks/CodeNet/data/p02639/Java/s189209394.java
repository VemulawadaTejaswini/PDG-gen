import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int x;

		for(int i = 1;i<6;i++) {
			x = scan.nextInt();
			if(x == 0) {
				System.out.println(x);
				break;
			}
		}

	}
}