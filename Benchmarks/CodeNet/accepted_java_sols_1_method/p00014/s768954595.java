import java.io.*;
import java.util.*;

public class Main {
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = 
			new BufferedReader(new InputStreamReader(System.in));
		
		ArrayList<String> ans = new ArrayList<String>();
		
		int sum = 0;
		
		while (true) {
			
			String s = br.readLine();
			if (s == null) break;
			
			int d = Integer.parseInt(s);
			int temp = d;
			for (; d <= 600 - temp; d += temp) {
				sum += d * d * temp;
			}
			ans.add(String.valueOf(sum));
			sum = 0;
		}
		
		for (String a : ans)
			System.out.println(a);
		
	}
	
}