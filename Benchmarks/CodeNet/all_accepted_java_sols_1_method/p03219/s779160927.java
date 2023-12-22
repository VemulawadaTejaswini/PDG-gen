
import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner scn = new Scanner(System.in);
		int X = scn.nextInt();
		X += scn.nextInt()/2;
		System.out.println(X);
	}
}
