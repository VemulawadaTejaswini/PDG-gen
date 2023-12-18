import java.util.Scanner;
public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int hankei = scan.nextInt();
		int menseki = 0;

		menseki = (int)(hankei*hankei*Math.PI);
		System.out.println(Math.round(menseki/Math.PI));

		scan.close();

	}

}
