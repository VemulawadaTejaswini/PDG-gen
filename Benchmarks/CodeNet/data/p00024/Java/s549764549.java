import java.io.PrintWriter;
import java.util.Scanner;

public class Main {

	static Scanner scan = new Scanner(System.in);
	static PrintWriter out = new PrintWriter(System.out);

	public static void main(String[] args) {
		while(scan.hasNext()){
			out.println((int)(Math.pow(scan.nextDouble()/9.8,2)*4.9)/5+2);
		}
		out.flush();
	}

	static int si() {
		return Integer.parseInt(scan.next());
	}
}