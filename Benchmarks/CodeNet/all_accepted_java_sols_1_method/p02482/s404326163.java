import java.io.*;
import java.util.*;

public class Main{
	public static void main(String[] args) throws IOException{
		BufferedReader r = new BufferedReader(new InputStreamReader(System.in),1);
		String s = r.readLine();
		StringTokenizer t = new StringTokenizer(s," ");
		int a,b;
		a = Integer.parseInt(t.nextToken().toString());
		b = Integer.parseInt(t.nextToken().toString());
		if (a<b) {
			System.out.println("a < b");
		} else if (a>b) {
			System.out.println("a > b");
		} else {
			System.out.println("a == b");
		}

	}
}