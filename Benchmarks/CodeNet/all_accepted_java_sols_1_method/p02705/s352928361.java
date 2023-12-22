import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		double R = scan.nextDouble();

		double answer = 2*R*Math.PI;

		System.out.println(answer);
		scan.close();
	}

}
