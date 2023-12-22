import java.io.PrintWriter;
import java.util.*;

public class Main {
		public static void main(String[] args) {
			Scanner stdin = new Scanner(System.in);
			PrintWriter out = new PrintWriter(System.out);
			
			int A = Integer.parseInt(stdin.next());
			int B = Integer.parseInt(stdin.next());
			
			if(A%2 != B%2) {
				out.print("IMPOSSIBLE");
			}
			else {
				out.print((A+B)/2);
			}
			
			out.flush();
	}
}


