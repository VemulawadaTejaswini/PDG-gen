import java.io.PrintWriter;
import java.util.Scanner;

public class Main {

	static Scanner scan = new Scanner(System.in);
	static PrintWriter out = new PrintWriter(System.out);

	public static void main(String[] args) {
		int n = si();
		int[] h = new int[6];
		for (int i = 0; i < n; i++) {
			double k = Double.parseDouble(scan.next());
			if(k<165) h[0]++;
			else if(k<170) h[1]++;
			else if(k<175) h[2]++;
			else if(k<180) h[3]++;
			else if(k<185) h[4]++;
			else h[5]++;
		}
		for (int i = 0; i < 6; i++) {
			String ass = "";
			for (int j = 0; j < h[i]; j++) ass+="*";
			out.println((i+1)+":"+ass);
		}
		out.flush();
	}

	static int si() {
		return Integer.parseInt(scan.next());
	}
}