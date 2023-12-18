import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;


public class Main {
	public void exec() throws IOException {
		Scanner input = new Scanner(System.in);
		PrintWriter out = new PrintWriter(System.out);
		double r = input.nextDouble();
		out.printf("%.6f %.6f", Math.PI*r*r, 2*Math.PI*r);
		out.flush();
		input.close();
	}

	public static void main(String[] args) throws IOException {
		new Main().exec();
	}
}