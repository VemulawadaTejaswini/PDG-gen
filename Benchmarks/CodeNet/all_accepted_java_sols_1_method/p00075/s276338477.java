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
			StringTokenizer st = new StringTokenizer(s,",");
			int number = Integer.parseInt(st.nextToken());
			double weight = Double.parseDouble(st.nextToken());
			double height = Double.parseDouble(st.nextToken());
			
			if (weight / (height * height) >= 25) {
				ans.add(number);
			}
			
		}
		
		if (ans.size() == 0) {
			
			System.out.println("該当なし");
			
		} else {
			
			for (int a : ans)
				System.out.println(a);
			
		}
		
	}
	
}