
import java.util.Scanner;

public class Main{
	public static void main(String args[]) {
		Scanner scn = new Scanner(System.in);
		int N = scn.nextInt(), K = scn.nextInt();
		System.out.println((N-2)/(K-1) + 1);

		scn.close();
	}
}