import java.util.Scanner;

public class ITP_1_4_B {
	public static void main(String args[]) {
		Scanner scn = new Scanner(System.in);
		double r = scn.nextInt();
		scn.close();
		System.out.println((float)(r * r * Math.PI) + " " + (float)(2 * Math.PI * r));
	}
}

