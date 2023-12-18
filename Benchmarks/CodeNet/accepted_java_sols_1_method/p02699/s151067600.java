import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner scnr = new Scanner(System.in);
		int numSheep = scnr.nextInt();
		int numWolf = scnr.nextInt();

		if (numSheep > numWolf) {
			System.out.print("safe");
		}
		else if (numSheep < numWolf) {
			System.out.print("unsafe");
		}
		else {
			System.out.print("unsafe");
		}
	}
}
