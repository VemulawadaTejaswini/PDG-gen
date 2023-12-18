import java.io.*;
import java.math.*;
import java.util.*;

class Main {
	
	public static int setNum (String str) {
		
		if (str.equals("A")) {
			return 0;
		} else if (str.equals("B")) {
			return 1;
		} else {
			return 2;
		}
		
	}
	
	public static void main(String[] args) throws IOException {

		BufferedReader br =
			new BufferedReader(new InputStreamReader(System.in));

//		ArrayList<String> ans = new ArrayList<String>();
		
		boolean[] cup = {true,false,false};
		
		while (true) {

			String s = br.readLine();
			if (s == null) break;
			
			StringTokenizer st = new StringTokenizer(s,",");
			int from = setNum(st.nextToken());
			int to = setNum(st.nextToken());
			boolean temp;
			
			temp = cup[to];
			cup[to] = cup[from];
			cup[from] = temp;
			
		}
		
		for (int i = 0; i < cup.length; i++) {
			if (cup[i]) {
				
				switch (i) {
					case 0 : System.out.println("A"); break;
					case 1 : System.out.println("B"); break;
					case 2 : System.out.println("C"); break;
				}
				
				break;
			}
		}
		
		
//		for (String p : ans) {
//			System.out.println(p);
//		}
	}

}