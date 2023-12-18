import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Main run = new Main();
		run.calc();

	}
	
	private void calc() {
		Scanner sc = new Scanner( System.in );
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		int d = a / b;
		int r = a % d;
		double f = (double)a / (double)b;
		
		
		System.out.printf("%d %d %05f", d, r, f);
	}
}