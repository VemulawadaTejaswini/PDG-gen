import java.io.*;
import java.util.*;

public class Main {
	
	public static int gcd(int m, int n) {
		if(n == 0) return m;
		return gcd(n, m % n);
	}
	
	public static long lcm(int m, int n) {
		return ((long)m * n) / gcd(m, n);
	}
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = 
			new BufferedReader(new InputStreamReader(System.in));
		
		ArrayList<String> ans = new ArrayList<String>();
		
		while (true) {
			
			String s = br.readLine();
			if(s == null) break;
			StringTokenizer st = new StringTokenizer(s," ");
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			ans.add(String.valueOf(gcd(a,b)) + " " + String.valueOf(lcm(a,b)));
			
		}
		for(String q : ans) {
			System.out.println(q);
		}
		
	}
	
}