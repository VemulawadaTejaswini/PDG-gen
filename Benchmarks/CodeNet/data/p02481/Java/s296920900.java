import java.io.*;
import java.util.*;

public class Main{
	public static void main(String[] args) throws IOException{
		BufferedReader r = new BufferedReader(new InputStreamReader(System.in),1);
		String s = r.readLine();
		StringTokenizer t = new StringTokenizer(s," ");
		int p,q;
		p = Integer.parseInt(t.nextToken().toString());
		q = Integer.parseInt(t.nextToken().toString());
		System.out.println(p*q+" "+2*(p+q));
	}
}