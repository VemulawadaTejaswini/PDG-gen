import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		try (Scanner scn = new Scanner(System.in)) {
			int S = scn.nextInt();
			int W = scn.nextInt();

			if(S > W) {
				System.out.println("safe");
			} else {
				System.out.println("unsafe");
			}
		}
	}
}