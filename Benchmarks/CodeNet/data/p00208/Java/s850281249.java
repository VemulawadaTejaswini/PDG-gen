import java.io.PrintWriter;
import java.util.Scanner;

public class Main {

	static Scanner scan = new Scanner(System.in);
	static PrintWriter out = new PrintWriter(System.out);

	public static void main(String[] args) {
		while(true){
			int n = si();
			if(n==0) break;

			char[] num = Integer.toOctalString(n).toCharArray();
			for (int i = 0; i<num.length ; i++) {
				if(num[i]>='4') num[i]++;
				if(num[i]>='6') num[i]++;
				out.print(num[i]);
			}
			out.println();
		}
		out.flush();
	}

	static int si() {
		return Integer.parseInt(scan.next());
	}
}