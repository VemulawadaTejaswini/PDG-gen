import java.util.*;
import java.io.*;

public class Main {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = 
			new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		while (true) {
			
			String tmp = br.readLine();
			if (tmp == null) break;
			
			st = new StringTokenizer(tmp," ");
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			int n = Integer.parseInt(st.nextToken());
			int s = 0;
			
			a %= b;
	        for(int i = 0;i < n; i++) {
	        	a *= 10;
	        	s += (a / b);
	        	a %= b;
	        }
			
			System.out.println(s);
			
		}

	}

}