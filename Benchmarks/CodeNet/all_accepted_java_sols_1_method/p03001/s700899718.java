import java.util.*;
import java.io.*;
public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		long a = Integer.parseInt(st.nextToken());
		long b = Integer.parseInt(st.nextToken());
		long c = Integer.parseInt(st.nextToken());
		long d = Integer.parseInt(st.nextToken());
		System.out.println(a*b*1.0/2+" "+(c*1.0 == a*1.0/2 && d*1.0 == b*1.0/2? 1:0));
	}

}
