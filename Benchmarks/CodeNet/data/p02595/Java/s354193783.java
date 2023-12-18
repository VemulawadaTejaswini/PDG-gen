import java.io.*;
import java.util.*;


public class Main {
	public static void main(String args[])throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter pw = new PrintWriter(System.out);
		var st = new StringTokenizer(br.readLine()); 
		int n = Integer.parseInt(st.nextToken()); 
		Double dist = Double.parseDouble(st.nextToken());
		int counter = 0;
		for(var i = 0; i < n; ++i) {
			st = new StringTokenizer(br.readLine());
			int x = Integer.parseInt(st.nextToken());
			int y = Integer.parseInt(st.nextToken());
			if(distance(x,y).equals(dist) || distance(x,y) < dist) counter++;
		}	
		pw.println(counter);
		pw.close();
	}

	private static Double distance(int x, int y) {
		return Math.sqrt((x*x) + (y*y));
	}

}
