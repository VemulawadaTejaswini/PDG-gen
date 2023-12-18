import java.io.*;
import java.util.*;
class Main {
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = 
			new BufferedReader(new InputStreamReader(System.in));
		
		ArrayList<Integer> ans = new ArrayList<Integer>();
		
		while(true) {
			StringTokenizer st = new StringTokenizer(br.readLine()," ");
			int a = Integer.parseInt(st.nextToken());
			String op = st.nextToken();
			
			if (op.equals("?")) break;
			
			int b = Integer.parseInt(st.nextToken());
			
			if (op.equals("+")) {
				
				ans.add(a + b);
				
			} else if (op.equals("-")) {
				
				ans.add(a - b);
				
			} else if (op.equals("*")) {
				
				ans.add(a * b);
				
			} else {
				
				ans.add(a / b);
				
			}
		}
		
		for (int i = 0; i < ans.size(); i++) {
			System.out.println(ans.get(i));
		}
	}
	
}