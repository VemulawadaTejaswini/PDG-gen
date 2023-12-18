//package abc176;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] ip = br.readLine().split(" ");
		
		int N = Integer.parseInt(ip[0]);
		int X = Integer.parseInt(ip[1]);
		int T = Integer.parseInt(ip[2]);
		
		int ans = N/X*T;
		
		if(N%X != 0) ans += T;
		
		System.out.println(ans);
	}
	
}
