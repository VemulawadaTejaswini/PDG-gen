//package abc175;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str = br.readLine();
		
		//s-r
		int ans = 0;
		
		switch(str) {
			case "SSS":
				ans = 0;
				break;
			case "SSR":
			case "SRS":
			case "RSS":
			case "RSR":
				ans = 1;
				break;
			case "RRS":
			case "SRR":
				ans = 2;
				break;
			case "RRR":
				ans = 3;
				break;
		}
		
		System.out.println(ans);
	}
	
}
