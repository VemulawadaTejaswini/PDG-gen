import java.util.Scanner;

public class Main {
	private void calc(){
		Scanner scanner = new Scanner(System.in);
		double r =scanner.nextInt();
		double s = r*r*Math.PI;
		double l = 2.0*r*Math.PI;
		System.out.printf("%05f %05f", s, l);
	}
	
	public static void main(String[] args) {
		Main run =new Main();
		run.calc();

	}
}