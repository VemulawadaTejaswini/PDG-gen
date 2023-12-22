import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double r = scan.nextDouble();
		double g = scan.nextDouble();
		scan.close();
		System.out.println((int)(g*2-r));

	}

}