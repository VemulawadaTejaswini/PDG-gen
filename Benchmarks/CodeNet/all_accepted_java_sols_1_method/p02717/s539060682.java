
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int X = scan.nextInt();
		int Y = scan.nextInt();
		int Z = scan.nextInt();


		int temp = X;
		X = Y;
		Y = temp;

	    temp = X;
		X = Z;
		Z = temp;


		System.out.print(X + " " + Y + " " + Z);
		scan.close();

	}

}
