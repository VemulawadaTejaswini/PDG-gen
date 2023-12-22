import java.io.IOException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws IOException {
		print();
	}

	private static void print() throws IOException {
		Scanner scn = new Scanner(System.in);
		int recX = scn.nextInt();
		int recY = scn.nextInt();
		int cirX = scn.nextInt();
		int cirY = scn.nextInt();
		int cirRad = scn.nextInt();
		circleInRectangle(recX, recY, cirX, cirY, cirRad);
	}

	private static void circleInRectangle(int recX, int recY, int cirX, int cirY, int cirRad) {
		if (cirX - cirRad < 0) {
			System.out.println("No");
		} else if (cirX + cirRad > recX) {
			System.out.println("No");
		} else if (cirY - cirRad < 0) {
			System.out.println("No");
		} else if (cirY + cirRad > recY) {
			System.out.println("No");
		} else {
			System.out.println("Yes");
		}
	}

}