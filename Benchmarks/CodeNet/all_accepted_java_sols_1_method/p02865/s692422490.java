import java.io.PrintWriter;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		PrintWriter out = new PrintWriter(System.out);
		Integer N = Integer.parseInt(sc.next());
		int result=0;
		if(N % 2 ==0) {
			result = N / 2 -1;
		}
		else {
			result = N /2;
		}
		out.println(result);
		out.flush();
	}
}