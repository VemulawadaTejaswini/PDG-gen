import java.io.*;
import java.util.*;

class Main {
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = 
			new BufferedReader(new InputStreamReader(System.in));
		
		ArrayList<Integer> ans = new ArrayList<Integer>();
		
		while (true) {
			
			StringTokenizer st = new StringTokenizer(br.readLine()," ");
			int y = 2004;
			int m = Integer.parseInt(st.nextToken());
			int d = Integer.parseInt(st.nextToken());
			if (m == 0) break;
			if (m == 1 || m == 2) {
				y--;
				if (m == 1) m = 13;
				if (m == 2) m = 14;
			}
			ans.add(
					 (y + ( y / 4 ) - ( y / 100 ) + ( y / 400 ) + ( (13 * m + 8 ) / 5 ) + d) % 7 
			);
			
		}
		
		for (int a : ans) {
			
			switch (a) {
				case 0 : System.out.println("Sunday"); break;
				case 1 : System.out.println("Monday"); break;
				case 2 : System.out.println("Tuesday"); break;
				case 3 : System.out.println("Wednesday"); break;
				case 4 : System.out.println("Thursday"); break;
				case 5 : System.out.println("Friday"); break;
				case 6 : System.out.println("Saturday"); break;
			}
			
		}
	}
	
}