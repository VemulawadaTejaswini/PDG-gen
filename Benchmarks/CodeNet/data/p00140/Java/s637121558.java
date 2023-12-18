import java.io.PrintWriter;
import java.util.Scanner;

public class Main {


	public static void main(String[] args) {

		PrintWriter out = new PrintWriter(System.out);
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		for (int i = 0; i < n; i++) {
			byte s = Byte.parseByte(scan.next());
			byte g = Byte.parseByte(scan.next());
			if(s<g || s<=5) out.println(range(s,g));
			else out.print(range(s,(byte)9)+" "+range((byte)5,g));
		}
		out.flush();
	}

	static String range(byte p,byte q){
		int d = p<q ? 1:-1;
		String mes = "";
		for (int i = p; i != q; i+=d) {
			mes+=i+" ";

		}
		return mes+q;
	}
}