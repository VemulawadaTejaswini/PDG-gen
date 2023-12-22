import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner scn = new Scanner(System.in);
		int rate = scn.nextInt();
		if(rate < 1200) {
			System.out.println("ABC");
		}else if(rate < 2800) {
			System.out.println("ARC");
		}else {
			System.out.println("AGC");
		}
		scn.close();
	}
}
