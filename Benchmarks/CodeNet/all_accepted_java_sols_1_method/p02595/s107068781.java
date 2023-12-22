//package abc174;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] ip = br.readLine().split(" ");
		
		int N = Integer.parseInt(ip[0]);
		double D = Double.parseDouble(ip[1]);
		
		int ans = 0;
		
		for(int i = 0 ; i < N ; i++) {
			ip = br.readLine().split(" ");
			int x = Integer.parseInt(ip[0]);
			int y = Integer.parseInt(ip[1]);
			
			double d = Math.sqrt(Math.pow(x,2)+Math.pow(y,2));
			
			if(d <= D)
				ans++;
		}
		
		System.out.println(ans);
	}
}
