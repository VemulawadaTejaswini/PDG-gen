import java.io.PrintWriter;
import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner stdin = new Scanner(System.in);
		PrintWriter out = new PrintWriter(System.out);
		
		int A = Integer.parseInt(stdin.next());
		int B = Integer.parseInt(stdin.next());
		
		int seki = A*B;
		int tasu = A+B;
		int hiku = A-B;

		out.println(Math.max(seki,Math.max(tasu,hiku)));
		out.flush();
	}

	
}