import java.io.PrintWriter;
import java.math.BigInteger;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		PrintWriter out = new PrintWriter(System.out);
		
		BigInteger a, b;
		int N = Integer.parseInt(input.nextLine());
		
		while(N > 0) {
			a = new BigInteger(input.nextLine());
			b = new BigInteger(input.nextLine());
			
			a = a.add(b);
			
			if(a.toString().length() > 80) {
				out.println("overflow");
			} else {
				out.println(a.toString());
			}			
			N--;
		}
		input.close();
		out.close();System.exit(0);
	}
}