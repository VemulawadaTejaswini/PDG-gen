import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class Main {
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = 
			new BufferedReader(new InputStreamReader(System.in));
		
		ArrayList<Integer> ans = new ArrayList<Integer>();
		
		while (true) {
			
			String s = br.readLine();
			if (s == null) break;
			
			double speed = Double.parseDouble(s);
			ans.add((int)(Math.pow(speed / 9.8,2) * 4.9 + 5) / 5 + 1);
			
		}
		
		for (int a : ans) {
			System.out.println(a);
		}
	}
	
}