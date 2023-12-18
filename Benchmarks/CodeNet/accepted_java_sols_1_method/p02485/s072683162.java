import java.io.*;
import java.util.*;
class Main {
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = 
			new BufferedReader(new InputStreamReader(System.in));
		
//		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		
		ArrayList<Integer> ans = new ArrayList<Integer>();
		
		while (true) {
			
			int sum = 0;
			String s = br.readLine();
			if (s.equals("0")) break;
			
			for (int i = 0; i < s.length(); i++)
				sum += s.charAt(i) - '0';
			ans.add(sum);
			
		}
		
		for (int n : ans) {
			System.out.println(n);
		}
	}
	
}