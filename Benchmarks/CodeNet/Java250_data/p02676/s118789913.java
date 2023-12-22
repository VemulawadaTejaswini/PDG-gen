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
		int k = scn.nextInt();
		String s = scn.next();
		if (s.length() <= k)
			System.out.println(s);
		else {
			System.out.println(s.substring(0,k) + "...");
		}

	}
}