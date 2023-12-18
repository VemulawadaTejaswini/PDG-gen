import java.util.Scanner;

public class Main {
	private void calc(){
		Scanner scanner = new Scanner(System.in);
		double r =scanner.nextInt();
		double pi=Math.PI;
		double s = r*r*pi;
		double l = 2.0*r*pi;
		System.out.printf("%06f %06f", s, l);
	}
	
	public static void main(String[] args) {
		Main run =new Main();
		run.calc();

	}
}