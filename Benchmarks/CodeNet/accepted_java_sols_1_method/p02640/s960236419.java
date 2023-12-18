import java.util.Scanner;

public class Main {
	//java11

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int X = sc.nextInt();
		int Y = sc.nextInt();

		if(Y % 2 != 0) {
			System.out.println("No");
			return;
		}

		int t = 2*X - Y/2;
		int k = -X + Y/2;

		if(t >= 0 && k >= 0) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}

	}

}
