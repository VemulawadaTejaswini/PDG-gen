import java.util.Scanner;


public class Main {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int N = scn.nextInt();
		int D = scn.nextInt();
		int shou = N / ( 2 * D + 1);
		int amari = N % ( 2 * D + 1);

		if (amari != 0) {
			shou++;
		}

		System.out.println(shou);
	}
}
