import java.io.*;
import java.util.*;

class Main {
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = 
			new BufferedReader(new InputStreamReader(System.in));
		
		ArrayList<Integer> ans = new ArrayList<Integer>();
		
		while (true) {
			
			String s = br.readLine();
			if (s == null) break;
			int n = Integer.parseInt(s);
			double sum = (n / 2.0) * (1 + n);
			ans.add((int)sum + 1);
		}
		
		for (int a : ans)
			System.out.println(a);
		
	}
	
}