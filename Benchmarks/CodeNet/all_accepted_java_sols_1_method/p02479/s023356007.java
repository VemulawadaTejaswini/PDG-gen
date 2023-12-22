import java.io.*;
import java.util.*;
class Main {
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = 
			new BufferedReader(new InputStreamReader(System.in));
		
//		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		double r = Double.parseDouble(br.readLine());
		
		System.out.printf("%5f %5f", Math.PI * r * r, 2 * Math.PI * r);
	}
	
}