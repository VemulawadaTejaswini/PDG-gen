import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int X = scan.nextInt();
		int Y = scan.nextInt();

		if(X * 2 <= Y && X * 4 >= Y && Y % 2 == 0) {
			System.out.println("Yes");
		}else {
			System.out.println("no");
		}

	}
}