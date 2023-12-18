import java.util.Scanner;


public class Main {


	public static void main(String[] args) {

		int r;
		double menseki,syuu;

		Scanner sc = new Scanner(System.in);

		r = sc.nextInt();

		menseki = r * r * Math.PI;
		syuu = (r + r) * Math.PI;

		System.out.println(menseki + " " + syuu);

	}

}