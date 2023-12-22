import java.io.*;
import java.util.StringTokenizer;
import java.util.Collections;
import java.util.ArrayList;

class Main {
	public static void main(String args[]) {
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);

		try {
			int n = Integer.parseInt(br.readLine());
			for (int i=0;i<n;i++) {
				String buf = br.readLine();
				StringTokenizer st = new StringTokenizer(buf);
				ArrayList<Integer> a = new ArrayList<Integer>();
				a.add(Integer.parseInt(st.nextToken()));
				a.add(Integer.parseInt(st.nextToken()));
				a.add(Integer.parseInt(st.nextToken()));
	
				Collections.sort(a);
				if (Math.pow(a.get(0),2)+Math.pow(a.get(1),2)==Math.pow(a.get(2),2))
					System.out.println("YES");
				else System.out.println("NO");
			}
		} catch (IOException e) {
			System.out.println("IOException!");
		}
	}
}