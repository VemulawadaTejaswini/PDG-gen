import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		PrintWriter out = new PrintWriter(System.out);
		while (true) {
			String str = sc.nextLine();
			if (str.equals("END OF INPUT")) break;
			String[] strs = str.split(" ");
			for (int i = 0; i < strs.length; i++) {
				out.print(strs[i].length());
			}
			out.println();
		}
		out.flush();
		sc.close();
	}
}	