import java.io.*;
import java.util.*;

public class Main {
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = 
			new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		double a = Double.parseDouble(st.nextToken());
		double b = Double.parseDouble(st.nextToken());
		double c = Double.parseDouble(st.nextToken());
		double d = Double.parseDouble(st.nextToken());
		double e = Double.parseDouble(st.nextToken());
		double f = Double.parseDouble(st.nextToken());
		double x = (c * e - b * f) / (a * e - b * d);
		double y = (f * a - c * d) / (a * e - d * b);
		System.out.printf("\n%.4f %.4f\n", x, y);
		
	}
	
}