import java.io.*;
import java.util.*;

public class Main {
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = 
			new BufferedReader(new InputStreamReader(System.in));
		
		ArrayList<Integer> ans = new ArrayList<Integer>();
		
		while(true) {
			
			String s = br.readLine();
			if (s == null) break;
			StringTokenizer st = new StringTokenizer(s," ");
			ans.add(String.valueOf(Integer.parseInt(st.nextToken()) + 
					Integer.parseInt(st.nextToken())).length());
		}
		for (int a : ans)
			System.out.println(a);
	}
	
}