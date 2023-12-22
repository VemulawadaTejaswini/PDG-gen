//package abc176;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		
		int ans = 0;
		
		for(char c : str.toCharArray()) {
			ans = ( ans + c-'0')%9; 
		}
		
		if(ans == 0)
			System.out.println("Yes");
		else
			System.out.println("No");
	}
	
}
