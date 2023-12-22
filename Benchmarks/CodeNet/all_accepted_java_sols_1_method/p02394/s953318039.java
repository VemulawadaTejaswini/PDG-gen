import java.io.*;
import java.util.StringTokenizer;

class Main {
	public static void main(String args[]) {
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);

		try {
			String buf = br.readLine();
			StringTokenizer st = new StringTokenizer(buf);
			int W = Integer.parseInt(st.nextToken());
			int H = Integer.parseInt(st.nextToken());
			int x = Integer.parseInt(st.nextToken());
			int y = Integer.parseInt(st.nextToken());
			int r = Integer.parseInt(st.nextToken());

			if (x-r<0||x+r>W||y-r<0||y+r>H) 
				System.out.println("No");
			else System.out.println("Yes");
		} catch (IOException e) {
			System.out.println("IOException!");
		}
	}
}