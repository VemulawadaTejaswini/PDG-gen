import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int ndata = Integer.parseInt(br.readLine());
		List<String> results = new ArrayList<String>();
		
		while (ndata > 0) {
			String line = br.readLine();
			StringTokenizer st = new StringTokenizer(line);

			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			int c = Integer.parseInt(st.nextToken());
			
			if (a*a + b*b == c*c || b*b + c*c == a*a || a*a + c*c == b*b) {
				results.add("YES");
			} else {
				results.add("NO");
			}
			
			ndata--;
		}
		
		for (String r : results) {
			System.out.println(r);
		}
	}
}