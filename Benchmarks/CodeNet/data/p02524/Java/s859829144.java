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
		
		System.out.printf("%.8f\n", a * b / 2);
		System.out.printf("%.8f\n", temp);
		
		a /= 2;
		
		System.out.printf("%.8f", b * b - a * a);
		
	}
	
}