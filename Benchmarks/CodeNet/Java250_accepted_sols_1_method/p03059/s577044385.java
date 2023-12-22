import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		String InStr = scan.nextLine();
		String[] AryStr = InStr.split(" ");

		int A = Integer.parseInt(AryStr[0]);
		int B = Integer.parseInt(AryStr[1]);
		int T = Integer.parseInt(AryStr[2]);
		int X;

		X = T / A;

		System.out.println(B * X);

		scan.close();
	}
}
