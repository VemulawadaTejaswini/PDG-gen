import java.io.*;
import java.util.*;

class Main {
	
	public static void main(String[] args) throws IOException {

		BufferedReader br =
			new BufferedReader(new InputStreamReader(System.in));

//		ArrayList<Integer> ans = new ArrayList<Integer>();
		int[] type = new int[4];
		String[] bt = {"A","B","AB","O"};
		
		String[] msg = {"light fly","fly","bantam","feather","light","light welter",
						"welter","light middle","middle","light heavy"};
		double[] w = {48,51,54,57,60,64,69,75,81,91};
		
		while (true) {
			
			String s = br.readLine();
			if (s == null) break;
			
			StringTokenizer st = new StringTokenizer(s,",");
			st.nextToken();
			String t = st.nextToken();
			
			for (int i = 0; i < bt.length; i++) {
				if (t.equals(bt[i])) {
					type[i]++;
					continue;
				}
			}
			
		}
		
		for (int p : type) {
			System.out.println(p);
		}
		
//		for (String a : ans)
//			System.out.println(a);

	}

}