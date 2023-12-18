import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int X = sc.nextInt();
		int Y = sc.nextInt();

		if(Y%2 == 1) {
			System.out.println("No");
			System.exit(0);
		}

		if(X*2<=Y && Y<= X*4) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}

	}

}
