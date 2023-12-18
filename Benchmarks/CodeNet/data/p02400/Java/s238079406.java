import java.util.Scanner;

public class Main {
	void run() {
		Scanner scan = new Scanner(System.in);
		int r = scan.nextInt();
		System.out.printf("%f %f\n", r*r*Math.PI, 2*Math.PI*r);
	}
	public static void main(String[] args) {
		new Main().run();
	}
}