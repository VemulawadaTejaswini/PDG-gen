import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int X = sc.nextInt();
		int Y = sc.nextInt();
		String res = "Yes";

		if(Y%2 != 0) {
			res = "No";
		}

		if(Y < 2*X) {
			res = "No";
		}

		if(Y > 4*X) {
			res = "No";
		}

		System.out.print(res);
	}

}
