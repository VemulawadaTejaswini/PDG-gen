import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int r = sc.nextInt();

		String game;
		if(r<1200)game = "ABC";
		else if(r<2800)game = "ARC";
		else game = "AGC";
		System.out.println(game);
	}
}