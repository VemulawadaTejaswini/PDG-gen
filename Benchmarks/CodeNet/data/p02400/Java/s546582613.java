import java.io.ByteArrayInputStream;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
	
	String INPUT = "";
	
	public static void main(String[] args) throws Exception {
		new Main().run();
	}
	
	void run() {
		Scanner sc = INPUT.isEmpty() ? new Scanner(System.in) : new Scanner(new ByteArrayInputStream(INPUT.getBytes()));
		PrintWriter out = new PrintWriter(System.out);
		
		solve(sc, out);
		out.flush();
	}
	
	void solve(Scanner sc, PrintWriter out) {
		double r = sc.nextDouble();
		
		double a = 2*r*Math.PI;
		double b = r*r*Math.PI;
		System.out.println(String.format("%.6f", a) + " " + String.format("%.6f", b));
	}
}

