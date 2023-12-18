import java.io.*;
import java.util.*;

public class Main {

	static long pmod = 1000000007L;

	public static void main(String[] args) throws IOException {

//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		PrintWriter op = new PrintWriter(System.out);
//		StringTokenizer ste = new StringTokenizer(br.readLine());
//
//		StringBuilder ash = new StringBuilder();
//		for (int tcs = Integer.parseInt(ste.nextToken()) - 1; tcs >= 0; --tcs) {
//
//			ste = new StringTokenizer(br.readLine());
//			String s1 = ste.nextToken();
//
//		}
//		op.print(ash);
//		op.flush();
		Scanner scn = new Scanner(System.in);
		String n = scn.next();
		char ch = n.charAt(n.length() - 1);
		if (ch == '3')
			System.out.println("bon");
		else if (ch == '0' || ch == '1' || ch == '6' || ch == '8')
			System.out.println("pon");
		else
			System.out.println("hon");

	}
}