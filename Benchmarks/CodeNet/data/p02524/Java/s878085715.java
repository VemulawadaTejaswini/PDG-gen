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
		
		double temp = Math.sqrt(a * a + b * b) + a + b;
		
		double p = Math.sqrt(a * a + b * b);
		
		System.out.printf("%.8f\n", a * b / 2);
		System.out.printf("%.8f\n", temp);
		
		double s = Math.sqrt((a + b + p) * (-a + b + p) * (a - b + p) * (a + b - p)) / 4;
		System.out.printf("%.8f\n", 2 * s / a);
	}
	
}