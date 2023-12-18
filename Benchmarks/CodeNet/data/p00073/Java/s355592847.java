import java.io.*;
import java.util.*;

class Main {
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = 
			new BufferedReader(new InputStreamReader(System.in));
		
		ArrayList<Double> ans = new ArrayList<Double>();
		
		while (true) {
			
			int x = Integer.parseInt(br.readLine());
			int h = Integer.parseInt(br.readLine());
			
			if (x == 0 && h == 0) break;
			ans.add(x * x + x * Math.sqrt(4.0 * h * h + x * x));
			
		}
		
		for (double d : ans) {
			System.out.printf("%.6f\n", d);
		}
		
	}
	
}