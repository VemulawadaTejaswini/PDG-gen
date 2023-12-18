import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;


public class Main {
	public void exec() throws IOException {
		Scanner input = new Scanner(System.in);
		PrintWriter out = new PrintWriter(System.out);
		int a = input.nextInt();
		int b = input.nextInt();
		out.printf("%d %d %.5f", a/b,a%b,(double)a/b);
		out.flush();
		input.close();
	}

	public static void main(String[] args) throws IOException {
		new Main().exec();
	}
}