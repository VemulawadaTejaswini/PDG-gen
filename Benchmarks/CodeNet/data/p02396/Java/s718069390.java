import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner scn;
		int i = 1;
		while((scn = new Scanner(System.in)) != null) {
			System.out.println("case " + i + ": " + scn.nextInt());
		}
		scn.close();
	}
}
