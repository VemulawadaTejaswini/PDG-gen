import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		double r = s.nextDouble();
		s.close();
		System.out.println((Math.PI*r*r) + " " + (Math.PI*r*2));
	}

}