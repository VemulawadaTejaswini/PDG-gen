//package abc178;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] ip = br.readLine().split(" ");
		
		long a = Long.parseLong(ip[0]);
		long b = Long.parseLong(ip[1]);
		long c = Long.parseLong(ip[2]);
		long d = Long.parseLong(ip[3]);
		
		long p = a*c;
		long q = a*d;
		long r = b*c;
		long s = b*d;
		
		System.out.println(Math.max(p, Math.max(r, Math.max(q,s))));	
	}
}
