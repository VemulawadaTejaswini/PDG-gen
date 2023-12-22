import java.util.Scanner;

class Main {

	public static void main(String[] args) {

		Scanner scane = new Scanner(System.in);

		int a = scane.nextInt();
		int b = scane.nextInt();

		String s = String.format("%.5f", (double)a/(double)b);

		System.out.println(a/b+" "+a%b+" "+s);



	}
}