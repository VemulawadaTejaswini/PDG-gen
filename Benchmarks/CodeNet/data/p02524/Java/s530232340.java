import java.io.*;
import java.util.*;
class Main {
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = 
			new BufferedReader(new InputStreamReader(System.in));
		
		// Math.sin(Math.toRadians(i)) : sin
		
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		
		double a, b, c;
		a = Double.parseDouble(st.nextToken());
		b = Double.parseDouble(st.nextToken());
		c = Double.parseDouble(st.nextToken());
		
		System.out.printf("%.8f\n",a * b / 2 * Math.sin(Math.toRadians(c)));
		System.out.printf("%.8f\n",a + b + Math.sqrt(a * a + b * b - 2 * a * b * Math.cos(Math.toRadians((c)))));
		System.out.printf("%.8f\n",b * Math.sin(Math.toRadians(c)));
	}
	
}